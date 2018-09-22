package org.cuber.basic.cache.carrier;

import org.cuber.cache.storage.ICacheCarrier;
import org.cuber.stub.basic.AppDef;

public interface AppDefCarrier extends ICacheCarrier<AppDef> {
    AppDef loadByAppName(String appName);
}
