package org.cuber.basic.cache.carrier.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.dto.CacheDefEntity;
import org.cuber.basic.helper.CacheDefHelper;
import org.cuber.basic.mapper.CacheDefEntityMapper;
import org.cuber.stub.basic.CacheDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CacheDefCarrierImpl implements CacheDefCarrier {

    public static final String CACHE_DEF_CACHE_NAME = "cache_def";
    @Autowired
    private CacheDefEntityMapper cacheDefEntityMapper;

    @Override
    public CacheDef carryByKey(CacheDef cacheDef) {
        CacheDefEntity cacheDefEntity = CacheDefHelper.VO2DTO(cacheDef);
        cacheDefEntity = cacheDefEntityMapper.retrieveByUnique(cacheDefEntity);
        CacheDef result = CacheDefHelper.DTO2VO(cacheDefEntity);
        return result;
    }

    @Override
    public CacheDef loadDef() {
        return loadDef(CACHE_DEF_CACHE_NAME);
    }

    @Override
    public CacheDef loadDef(String cacheName) {
        CacheDef cacheDef = new CacheDef();
        cacheDef.setCacheName(cacheName);
        return carryByKey(cacheDef);
    }

    @Override
    public List<CacheDef> loadCacheByAppName(String appName) {
        List<CacheDef> result = null;
        List<CacheDefEntity> entities = cacheDefEntityMapper.retrieveByAppNameOrGlobal(appName);
        if (CollectionUtils.isNotEmpty(entities)) {
            result = entities
                    .stream()
                    .map(cacheDefEntity -> CacheDefHelper.DTO2VO(cacheDefEntity))
                    .collect(Collectors.toList());
        }
        return result;
    }
}
