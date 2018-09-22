package org.cuber.basic.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.basic.dto.AppDefEntity;
import org.cuber.stub.repo.Mapper;

public interface AppDefEntityMapper extends Mapper<AppDefEntity, String> {

    AppDefEntity retrieveByAppName(@Param("appName") String appName);
}