package org.cuber.basic.biz.service.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.basic.biz.service.AppDefBizService;
import org.cuber.basic.dto.AppDefEntity;
import org.cuber.basic.mapper.AppDefEntityMapper;
import org.cuber.stub.StubConstant;
import org.cuber.stub.basic.AppDef;
import org.cuber.stub.initializer.PropertyFactory;
import org.cuber.stub.util.TransUtils;
import org.cuber.zk.XClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppDefBizServiceImpl implements AppDefBizService {

    @Autowired(required = false)
    private AppDefEntityMapper appDefEntityMapper;

    private static final Logger logger = LoggerFactory.getLogger(AppDefBizServiceImpl.class);


    @Override
    public List<AppDef> loadAll() {
        List<AppDefEntity> appDefEntities = appDefEntityMapper.retrieveAll();
        List<AppDef> result = null;
        if (CollectionUtils.isNotEmpty(appDefEntities)) {
            result = appDefEntities.stream()
                    .map(appDefEntity -> TransUtils.copyP(appDefEntity, AppDef.class))
                    .collect(Collectors.toList());
        }
        return result;
    }

    @Override
    @PostConstruct
    public void load2Zk() {
        List<AppDef> appDefList = loadAll();
        if (CollectionUtils.isNotEmpty(appDefList)) {
            appDefList.forEach(appDef -> loadApp(appDef));
        }
    }

    private void loadApp(AppDef appDef) {
        String path = PropertyFactory.ENV_ROOT_PATH + PropertyFactory.PATH_SPLIT + appDef.getAppName();
        try {
            if (StubConstant.STATUS.VALID.equals(appDef.getStatus())) {
                XClient.writePath(path, appDef);
            }
        } catch (Exception e) {
            logger.error("加载出错", e);
        }
    }
}
