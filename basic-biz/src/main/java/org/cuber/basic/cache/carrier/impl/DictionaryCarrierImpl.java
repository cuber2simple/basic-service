package org.cuber.basic.cache.carrier.impl;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.cache.carrier.DictionaryCarrier;
import org.cuber.basic.dto.DictDataEntity;
import org.cuber.basic.dto.DictTypeEntity;
import org.cuber.basic.helper.DictionaryHelper;
import org.cuber.basic.mapper.DictDataEntityMapper;
import org.cuber.basic.mapper.DictTypeEntityMapper;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class DictionaryCarrierImpl implements DictionaryCarrier {

    public static final String DICTIONARY_CACHE_NAME = "dictionary";

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Autowired
    private DictDataEntityMapper dictDataEntityMapper;

    @Autowired
    private DictTypeEntityMapper dictTypeEntityMapper;

    @Override
    public Dictionary carryByKey(Dictionary dictionary) {
        Dictionary result = null;
        DictTypeEntity dictTypeEntity = dictTypeEntityMapper.retrieveByDictName(dictionary.getDictName());
        if (Objects.nonNull(dictTypeEntity)) {
            result = DictionaryHelper.dto2Vo(dictTypeEntity);
            List<DictDataEntity> dataEntities = dictDataEntityMapper.retrieveByDictName(dictionary.getDictName());
            if (CollectionUtils.isNotEmpty(dataEntities)) {
                List<Dictionary.DictionaryData> dataList = dataEntities
                        .stream()
                        .map(dictDataEntity -> DictionaryHelper.dto2Vo(dictDataEntity))
                        .collect(Collectors.toList());
                DictionaryHelper.transform(dictionary, dataList);
            }
        }
        return result;
    }


    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef(DICTIONARY_CACHE_NAME);
    }
}
