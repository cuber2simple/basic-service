package org.cuber.basic.cache;

import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.facade.bridge.CacheDefBridge;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.rpc.Req;
import org.cuber.stub.rpc.Resp;
import org.cuber.stub.rpc.StubException;
import org.cuber.stub.util.RpcUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cacheBizService")
public class CacheBizService implements CacheDefBridge {

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Override
    public Resp<List<CacheDef>> loadCacheByAppName(Req<String> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        String appName = req.getAppName();
        List<CacheDef> cacheDefs = cacheDefCarrier.loadCacheByAppName(appName);
        return RpcUtils.success(cacheDefs);
    }

    @Override
    public Resp<CacheDef> loadByKey(Req<CacheDef> req) throws StubException {
        RpcUtils.verifyVoNotNull(req);
        CacheDef searchIns = req.getReq();
        return RpcUtils.success(cacheDefCarrier.carryByKey(searchIns));
    }

    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef();
    }
}
