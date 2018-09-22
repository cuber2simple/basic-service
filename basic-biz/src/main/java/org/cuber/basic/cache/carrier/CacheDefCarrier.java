package org.cuber.basic.cache.carrier;

import org.cuber.cache.storage.ICacheCarrier;
import org.cuber.stub.basic.CacheDef;

import java.util.List;

public interface CacheDefCarrier extends ICacheCarrier<CacheDef> {

    CacheDef loadDef(String cacheName);

    List<CacheDef> loadCacheByAppName(String appName);
}
