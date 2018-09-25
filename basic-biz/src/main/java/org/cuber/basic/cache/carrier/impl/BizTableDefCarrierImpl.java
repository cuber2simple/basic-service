package org.cuber.basic.cache.carrier.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.basic.cache.carrier.BizTableDefCarrier;
import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.dto.BizTableDefEntity;
import org.cuber.basic.mapper.BizTableDefEntityMapper;
import org.cuber.stub.basic.BizTableDef;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.util.TransUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BizTableDefCarrierImpl implements BizTableDefCarrier {

    public static final String BIZ_TABLE_DEF_CACHE_NAME = "biz_table_def";

    @Autowired(required = false)
    private BizTableDefEntityMapper bizTableDefEntityMapper;

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Override
    public List<BizTableDef> loadByAppName(String appName) {
        List<BizTableDef> result = null;
        List<BizTableDefEntity> entities = bizTableDefEntityMapper.retrieveByAppName(appName);
        if (CollectionUtils.isNotEmpty(entities)) {
            result = entities.stream()
                    .map(bizTableDefEntity -> TransUtils.copyP(bizTableDefEntity, BizTableDef.class))
                    .collect(Collectors.toList());
        }
        return result;
    }

    @Override
    public BizTableDef carryByKey(BizTableDef bizTableDef) {
        BizTableDefEntity bizTableDefEntity = bizTableDefEntityMapper
                .retrieveByUnique(TransUtils.copyP(bizTableDef, BizTableDefEntity.class));
        return TransUtils.copyP(bizTableDefEntity, BizTableDef.class);
    }

    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef(BIZ_TABLE_DEF_CACHE_NAME);
    }
}
