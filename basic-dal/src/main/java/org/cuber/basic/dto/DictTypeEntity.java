package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_dict_type
 * remark      字典类型表
 */
public class DictTypeEntity extends StubConfDTO {


    /**
     * column_name    dict_name
     * remark         字典名称
     */
    private String dictName;


    /**
     * column_name    dict_type
     * remark         字典类型
     */
    private String dictType;


    /**
     * column_name    the_desc
     * remark         描述
     */
    private String theDesc;


    /**
     * column_name    is_sys
     * remark         是否系统使用 Y/N
     */
    private String isSys;


    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getDictName() {
        return dictName;
    }


    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }


    public String getDictType() {
        return dictType;
    }


    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }


    public String getTheDesc() {
        return theDesc;
    }


    public void setTheDesc(String theDesc) {
        this.theDesc = theDesc == null ? null : theDesc.trim();
    }


    public String getIsSys() {
        return isSys;
    }


    public void setIsSys(String isSys) {
        this.isSys = isSys == null ? null : isSys.trim();
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    @Override
    public String toString() {
        return GsonHolder.toJson(this);
    }
}