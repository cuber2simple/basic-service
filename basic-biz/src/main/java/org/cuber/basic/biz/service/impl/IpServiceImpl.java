package org.cuber.basic.biz.service.impl;

import com.google.common.net.InetAddresses;
import com.opencsv.CSVParser;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.common.IOUtils;
import org.cuber.basic.biz.service.IpService;
import org.cuber.basic.helper.StoreIP;
import org.cuber.basic.vo.Ip;
import org.cuber.stub.StubConstant;
import org.cuber.stub.rpc.StubException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisConnectionUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import java.util.zip.GZIPInputStream;

@Service
public class IpServiceImpl implements IpService {

    private static Logger logger = LogManager.getLogger(IpServiceImpl.class);

    private static final CSVParser csvParser = new CSVParser();

    private static final String ipv4A = "t_ip_4_a";
    private static final String ipv4B = "t_ip_4_b";
    private static final String ipv6A = "t_ip_6_a";
    private static final String ipv6B = "t_ip_6_b";
    private static final String KEY_FOR_A_B_4 = "IP_SET_NAME_4";
    private static final String KEY_FOR_A_B_6 = "IP_SET_NAME_6";
    private static final String KEY_FOR_B = "B";
    private static final String KEY_FOR_A = "A";
    private static final int INSERT_BATCH = 65535;

    private static ThreadLocal<AtomicLong> threadLocal = new ThreadLocal<>();

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Override
    public Ip load(String ipAddress) throws StubException {
        Ip result = null;
        try {
            String tableName = ipv6A;
            String key = (String) redisTemplate.opsForValue().get(KEY_FOR_A_B_6);
            if (KEY_FOR_B.equals(key)) {
                tableName = ipv6B;
            }
            InetAddress inetAddress = InetAddresses.forString(ipAddress);

            byte[] bytes = inetAddress.getAddress();
            if (inetAddress instanceof Inet4Address) {
                tableName = KEY_FOR_B.equals(redisTemplate.opsForValue().get(KEY_FOR_A_B_4)) ? ipv4B : ipv4A;
            }
            BigInteger ipNumber = new BigInteger(1, bytes);
            logger.info("读的集合名为:{}", tableName);
            result = searchIp(tableName, ipNumber);
            result.setIp(ipAddress);
        } catch (Exception e) {
            throw new StubException(StubConstant.UNKNOWN_ERR, e);
        }
        return result;
    }

    private Ip searchIp(String tableName, BigInteger ipNumber) throws Exception {
        RedisConnection redisConnection = redisConnectionFactory.getConnection();
        try {
            Set<RedisZSetCommands.Tuple> tuples = redisConnection.zRevRangeByScoreWithScores(tableName.getBytes(StandardCharsets.UTF_8),
                    0, ipNumber.doubleValue(), 0, 1);
            if (tuples != null && tuples.size() > 0) {
                Ip ipBO = new Ip();
                RedisZSetCommands.Tuple tuple = tuples.iterator().next();
                String[] data = csvParser.parseLine(new String(tuple.getValue(), StandardCharsets.UTF_8));
                if (data.length >= 5) {
                    ipBO.setCountryCode(data[1]);
                    ipBO.setCountryName(data[2]);
                    ipBO.setStateProv(data[3]);
                    ipBO.setCity(data[4]);
                    return ipBO;
                }
            }
        } catch (Exception e) {
            logger.error("错误", e);
        } finally {
            RedisConnectionUtils.releaseConnection(redisConnection, redisConnectionFactory);
        }
        return null;
    }

    @Override
    public long insertBatch(MultipartFile request, boolean isIpv4) throws StubException {
        BufferedReader reader = null;
        List<StoreIP> storage = new ArrayList<>(INSERT_BATCH);
        try {
            threadLocal.set(new AtomicLong(0));
            InputStream gis = new GZIPInputStream(request.getInputStream());
            final Reader decorator = new InputStreamReader(gis, StandardCharsets.UTF_8);
            reader = new BufferedReader(decorator);
            Stream<String> lines = reader.lines();
            String tableName = null;
            if (isIpv4) {
                tableName = KEY_FOR_B.equals(redisTemplate.opsForValue().get(KEY_FOR_A_B_4)) ? ipv4A : ipv4B;
            } else {
                tableName = KEY_FOR_B.equals(redisTemplate.opsForValue().get(KEY_FOR_A_B_6)) ? ipv6A : ipv6B;
            }
            String key = tableName;
            try {
                redisTemplate.delete(key);
            } catch (Exception e) {
                logger.error("删除KEY 出错,不用管。删除900万,会有超时的情况,继续装载IP", e);
            }
            logger.info("导入集合:{}", key);
            lines.forEach(str ->
                    loadList(str, storage, key)
            );
            if (storage.size() != 0) {
                dealWith(key, storage);
            }
            logger.info("插入完毕");
            updateRedis(isIpv4);
        } catch (Exception e) {
            throw new StubException(StubConstant.HTTP_FAILED_CODE, e);
        } finally {
            IOUtils.closeStream(reader);
        }
        return threadLocal.get().get();
    }

    private void loadList(String line, List<StoreIP> storage, String key) {
        try {
            if (storage.size() >= INSERT_BATCH) {
                dealWith(key, storage);
                storage.clear();
            }
            String[] data = csvParser.parseLine(line);
            if (data.length >= 6) {
                if (data[0].length() > 38 || data[1].length() > 38) {
                    logger.info("超过38:{}-->抛弃", line);
                } else {
                    StoreIP storeIP = new StoreIP();
                    storeIP.setStart(new BigInteger(data[0]));
                    String cutStart = StringUtils.substringAfter(line, ",");
                    String cutEnd = StringUtils.substringAfter(cutStart, ",");
                    String newLine = threadLocal.get().incrementAndGet() + "," + cutEnd;
                    storeIP.setLine(newLine);
                    storage.add(storeIP);
                }
            }
        } catch (Exception e) {
            logger.error("应该不会出错", e);
        }
    }


    private void dealWith(String key, List<StoreIP> storage) {
        redisTemplate.executePipelined((RedisCallback<Void>) redisConnection -> {
            storage.forEach(storeIP ->
                    redisConnection.zAdd(key.getBytes(StandardCharsets.UTF_8),
                            storeIP.getStart().doubleValue(),
                            storeIP.getLine().getBytes(StandardCharsets.UTF_8))
            );
            logger.info("导入数量{}", storage.size());
            return null;
        });
    }

    private void updateRedis(boolean isIpv4) {
        try {
            String key = isIpv4 ? KEY_FOR_A_B_4 : KEY_FOR_A_B_6;
            String redisValue = (String) redisTemplate.opsForValue().get(key);
            String value = KEY_FOR_B;
            if (StringUtils.isNotEmpty(redisValue)) {
                value = KEY_FOR_B.equals(redisTemplate.opsForValue().get(key)) ? KEY_FOR_A : KEY_FOR_B;
            }
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            logger.error("更新出错", e);
        }

    }
}
