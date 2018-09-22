package  org.cuber.basic.mapper;

import org.apache.ibatis.annotations.Param;
import  org.cuber.basic.dto.DictDataEntity;
import  java.lang.String;
import java.util.List;

import  org.cuber.stub.repo.Mapper;

public interface DictDataEntityMapper  extends Mapper<DictDataEntity,String> {

    List<DictDataEntity> retrieveByDictName(@Param("dictName") String dictName);
}