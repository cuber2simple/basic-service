package org.cuber.basic.cache.carrier.impl;

import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.springframework.beans.factory.annotation.Autowired;

public class DictionaryCarrierImpl {

    public static final String DICTIONARY_CACHE_NAME = "dictionary";

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

}
