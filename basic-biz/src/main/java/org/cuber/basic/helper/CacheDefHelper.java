package org.cuber.basic.helper;

import org.cuber.basic.dto.CacheDefEntity;
import org.cuber.stub.StubConstant;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.util.TransUtils;

import java.util.Objects;

public class CacheDefHelper {

    public static CacheDef DTO2VO(CacheDefEntity cacheDefEntity) {
        CacheDef cacheDef = TransUtils.copyP(cacheDefEntity, CacheDef.class);
        if (Objects.nonNull(cacheDef)) {
            cacheDef.setGlobal(StubConstant.Y_IS_TRUE.equals(cacheDefEntity.getIsGlobal()));
            cacheDef.setDurable(StubConstant.Y_IS_TRUE.equals(cacheDefEntity.getIsDurable()));
        }
        return cacheDef;
    }

    public static CacheDefEntity VO2DTO(CacheDef cacheDef) {
        CacheDefEntity cacheDefEntity = TransUtils.copyP(cacheDef, CacheDefEntity.class);
        if (Objects.nonNull(cacheDefEntity)) {
            cacheDefEntity.setIsDurable(cacheDef.isDurable() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
            cacheDefEntity.setIsGlobal(cacheDef.isGlobal() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
        }
        return cacheDefEntity;
    }

}
