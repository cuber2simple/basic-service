package org.cuber.basic.cache.carrier.impl;

import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.cache.carrier.CurrencyCarrier;
import org.cuber.basic.dto.CurrencyEntity;
import org.cuber.basic.mapper.CurrencyEntityMapper;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Currency;
import org.cuber.stub.util.TransUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyCarrierImpl implements CurrencyCarrier {

    public static final String CURRENCY_CACHE_NAME = "currency";

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Autowired
    private CurrencyEntityMapper currencyEntityMapper;

    @Override
    public Currency carryByKey(Currency currency) {
        CurrencyEntity currencyEntity = TransUtils.copyP(currency, CurrencyEntity.class);
        CurrencyEntity target = currencyEntityMapper.retrieveByUnique(currencyEntity);
        return TransUtils.copyP(target, Currency.class);
    }

    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef(CURRENCY_CACHE_NAME);
    }
}
