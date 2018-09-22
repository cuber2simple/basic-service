package org.cuber.basic.helper;

import org.apache.commons.collections4.CollectionUtils;
import org.cuber.basic.dto.DictDataEntity;
import org.cuber.basic.dto.DictTypeEntity;
import org.cuber.stub.StubConstant;
import org.cuber.stub.basic.Dictionary;
import org.cuber.stub.util.TransUtils;

import java.util.*;

public class DictionaryHelper {

    public static final String NO_PARENT_DICT_CODE = "-1";

    public static Dictionary.DictionaryData dto2Vo(DictDataEntity dictDataEntity) {
        Dictionary.DictionaryData data = TransUtils.copyP(dictDataEntity, Dictionary.DictionaryData.class);
        if (Objects.nonNull(data)) {
            data.setDefaultX(StubConstant.Y_IS_TRUE.equals(dictDataEntity.getIsDefault()));
            data.setTreeLeaf(StubConstant.Y_IS_TRUE.equals(dictDataEntity.getTreeLeaf()));
            data.setSys(StubConstant.Y_IS_TRUE.equals(dictDataEntity.getIsSys()));
        }
        return data;
    }

    public static DictDataEntity vo2Dto(Dictionary.DictionaryData data) {
        DictDataEntity dictDataEntity = TransUtils.copyP(data, DictDataEntity.class);
        if (Objects.nonNull(dictDataEntity)) {
            dictDataEntity.setIsSys(data.isSys() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
            dictDataEntity.setIsDefault(data.isDefaultX() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
            dictDataEntity.setTreeLeaf(data.isTreeLeaf() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
        }
        return dictDataEntity;
    }


    public static Dictionary dto2Vo(DictTypeEntity dictTypeEntity) {
        Dictionary dictionary = TransUtils.copyP(dictTypeEntity, Dictionary.class);
        if (Objects.nonNull(dictionary)) {
            dictionary.setSys(StubConstant.Y_IS_TRUE.equals(dictTypeEntity.getIsSys()));
        }
        return dictionary;
    }

    public static DictTypeEntity vo2Dto(Dictionary dictionary) {
        DictTypeEntity dictTypeEntity = TransUtils.copyP(dictionary, DictTypeEntity.class);
        if (Objects.nonNull(dictTypeEntity)) {
            dictTypeEntity.setIsSys(dictionary.isSys() ? StubConstant.Y_IS_TRUE : StubConstant.N_IS_FALSE);
        }
        return dictTypeEntity;
    }

    public static void transform(Dictionary dictionary, List<Dictionary.DictionaryData> dataList) {
        if (Objects.nonNull(dictionary) && CollectionUtils.isNotEmpty(dataList)) {
            Map<String, Dictionary.DictionaryData> destMap = new HashMap<>();
            List<Dictionary.DictionaryData> son = new ArrayList<>();
            dataList.forEach(dictionaryData -> {
                destMap.put(dictionaryData.getDictCode(), dictionaryData);
                if (NO_PARENT_DICT_CODE.equals(dictionaryData.getDictCode())) {
                    son.add(dictionaryData);
                }
            });
            dataList.forEach(dictionaryData -> {
                Dictionary.DictionaryData father = destMap.get(dictionaryData.getParentCode());
                if (Objects.nonNull(father)) {
                    List<Dictionary.DictionaryData> subItems = father.getSubItems();
                    if (Objects.isNull(subItems)) {
                        subItems = new ArrayList<>();
                        father.setSubItems(subItems);
                    }
                    subItems.add(dictionaryData);
                }
            });
            dictionary.setDictionaryItem(son);
        }
    }
}
