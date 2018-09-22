package org.cuber.basic.cache.carrier;

import org.cuber.cache.storage.ICacheCarrier;
import org.cuber.stub.basic.BizTableDef;

import java.util.List;

public interface BizTableDefCarrier extends ICacheCarrier<BizTableDef> {

    List<BizTableDef> loadByAppName(String appName);
}
