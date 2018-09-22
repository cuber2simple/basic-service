package org.cuber.basic.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.basic.dto.BizTableDefEntity;
import org.cuber.stub.repo.Mapper;

import java.util.List;

public interface BizTableDefEntityMapper extends Mapper<BizTableDefEntity, String> {

    BizTableDefEntity retrieveByUnique(BizTableDefEntity bizTableDefEntity);

    List<BizTableDefEntity> retrieveByAppName(@Param("appName") String appName);
}