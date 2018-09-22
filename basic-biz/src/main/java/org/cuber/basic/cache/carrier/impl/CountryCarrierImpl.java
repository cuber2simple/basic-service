package org.cuber.basic.cache.carrier.impl;

import org.cuber.basic.cache.carrier.CacheDefCarrier;
import org.cuber.basic.cache.carrier.CountryCarrier;
import org.cuber.basic.dto.CountryEntity;
import org.cuber.basic.mapper.CountryEntityMapper;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.basic.Country;
import org.cuber.stub.util.TransUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryCarrierImpl implements CountryCarrier {

    @Autowired
    private CountryEntityMapper countryEntityMapper;

    public static final String COUNTRY_CACHE_NAME = "country";

    @Autowired
    private CacheDefCarrier cacheDefCarrier;

    @Override
    public Country carryByKey(Country country) {
        CountryEntity search = TransUtils.copyP(country, CountryEntity.class);
        CountryEntity target = countryEntityMapper.retrieveByUnique(search);
        return TransUtils.copyP(target, Country.class);
    }

    @Override
    public CacheDef loadDef() {
        return cacheDefCarrier.loadDef(COUNTRY_CACHE_NAME);
    }
}
