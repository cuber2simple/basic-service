package org.cuber.basic.mapper;

import org.apache.ibatis.annotations.Param;
import org.cuber.basic.dto.DictTypeEntity;
import org.cuber.stub.repo.Mapper;

public interface DictTypeEntityMapper extends Mapper<DictTypeEntity, String> {

    DictTypeEntity retrieveByDictName(@Param("dictName") String dictName);
}