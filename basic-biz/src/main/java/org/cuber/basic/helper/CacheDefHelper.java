package org.cuber.basic.helper;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.cuber.basic.dto.CacheDefEntity;
import org.cuber.stub.StubConstant;
import org.cuber.stub.basic.CacheDef;
import org.cuber.stub.util.TransformUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class CacheDefHelper {
    public static final String SET_SPLIT = ";";
    public static final String FIELD_SPLIT = ",";

    public static CacheDef DTO2VO(CacheDefEntity cacheDefEntity) {
        CacheDef cacheDef = TransformUtils.copyP(cacheDefEntity, CacheDef.class, "fieldKeys");
        if (Objects.nonNull(cacheDef)) {
            String fields = cacheDefEntity.getFieldKeys();
            if (StringUtils.isNotEmpty(fields)) {
                List<String> firstSplit = Splitter.on(SET_SPLIT).splitToList(fields);
                List<List<String>> twoSplit = firstSplit.stream()
                        .map(field -> Splitter.on(FIELD_SPLIT).splitToList(field)).collect(Collectors.toList());
                cacheDef.setFieldKeys(new HashSet<>(twoSplit));
            }
            cacheDef.setGlobal(StubConstant.Y_IS_TRUE.equals(cacheDefEntity.getIsGlobal()));
            cacheDef.setDurable(StubConstant.Y_IS_TRUE.equals(cacheDefEntity.getIsDurable()));
        }
        return cacheDef;
    }

    public static CacheDefEntity VO2DTO(CacheDef cacheDef) {
        CacheDefEntity cacheDefEntity = TransformUtils.copyP(cacheDef, CacheDefEntity.class, "fieldKeys");
        if (Objects.nonNull(cacheDefEntity)) {
            Set<List<String>> fields = cacheDef.getFieldKeys();
            if (CollectionUtils.isNotEmpty(fields)) {
                List<String> firstJoiner = fields.stream().map(list -> Joiner.on(FIELD_SPLIT).join(list)).collect(Collectors.toList());
                String twoJoiner = Joiner.on(SET_SPLIT).join(firstJoiner);
                cacheDefEntity.setFieldKeys(twoJoiner);
            }
            cacheDefEntity.setIsDurable(cacheDef.isDurable() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
            cacheDefEntity.setIsGlobal(cacheDef.isGlobal() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
        }
        return cacheDefEntity;
    }

}
