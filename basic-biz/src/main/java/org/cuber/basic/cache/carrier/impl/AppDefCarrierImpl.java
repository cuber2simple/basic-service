package org.cuber.basic.cache.carrier.impl;

import org.cuber.basic.cache.carrier.AppDefCarrier;
import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.dto.AppDefEntity;
import org.cuber.basic.mapper.AppDefEntityMapper;
import org.cuber.stub.basic.AppDef;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.util.TransUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppDefCarrierImpl implements AppDefCarrier {

    public static final String APP_DEF_CACHE_NAME = "app_def";

    @Autowired(required = false)
    private AppDefEntityMapper appDefEntityMapper;

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Override
    public AppDef loadByAppName(String appName) {
        AppDefEntity appDefEntity = appDefEntityMapper.retrieveByAppName(appName);
        return TransUtils.copyP(appDefEntity, AppDef.class);
    }

    @Override
    public AppDef carryByKey(AppDef appDef) {
        return loadByAppName(appDef.getAppName());
    }

    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef(APP_DEF_CACHE_NAME);
    }
}
