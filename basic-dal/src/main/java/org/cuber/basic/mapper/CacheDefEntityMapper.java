package org.cuber.basic.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.basic.dto.CacheDefEntity;
import org.cuber.stub.repo.Mapper;

import java.util.List;

public interface CacheDefEntityMapper extends Mapper<CacheDefEntity, String> {
    /**
     * 根据appName 或者 全局
     */
    List<CacheDefEntity> retrieveByAppNameOrGlobal(@Param("appName") String appName);

    /**
     *  根据查询查找唯一的索引
     */
    CacheDefEntity retrieveByUnique(CacheDefEntity cacheDefEntity);
}