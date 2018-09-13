package org.cuber.basic.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_dict_data
 * remark
 */
public class DictDataEntity extends StubConfDTO {


    /**
     * column_name    dict_code
     * remark
     */
    private String dictCode;


    /**
     * column_name    parent_code
     * remark
     */
    private String parentCode;


    /**
     * column_name    tree_sort
     * remark
     */
    private Short treeSort;


    /**
     * column_name    tree_leaf
     * remark
     */
    private String treeLeaf;


    /**
     * column_name    tree_level
     * remark
     */
    private Short treeLevel;


    /**
     * column_name    dict_label
     * remark
     */
    private String dictLabel;


    /**
     * column_name    dict_value
     * remark
     */
    private String dictValue;


    /**
     * column_name    dict_name
     * remark
     */
    private String dictName;


    /**
     * column_name    dict_tag
     * remark
     */
    private String dictTag;


    /**
     * column_name    is_sys
     * remark
     */
    private String isSys;


    /**
     * column_name    is_default
     * remark
     */
    private String isDefault;


    /**
     * column_name    the_desc
     * remark
     */
    private String theDesc;


    /**
     * column_name    update_datetime
     * remark
     */
    private LocalDateTime updateDatetime;


    public String getDictCode() {
        return dictCode;
    }


    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }


    public String getParentCode() {
        return parentCode;
    }


    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }


    public Short getTreeSort() {
        return treeSort;
    }


    public void setTreeSort(Short treeSort) {
        this.treeSort = treeSort;
    }


    public String getTreeLeaf() {
        return treeLeaf;
    }


    public void setTreeLeaf(String treeLeaf) {
        this.treeLeaf = treeLeaf == null ? null : treeLeaf.trim();
    }


    public Short getTreeLevel() {
        return treeLevel;
    }


    public void setTreeLevel(Short treeLevel) {
        this.treeLevel = treeLevel;
    }


    public String getDictLabel() {
        return dictLabel;
    }


    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel == null ? null : dictLabel.trim();
    }


    public String getDictValue() {
        return dictValue;
    }


    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }


    public String getDictName() {
        return dictName;
    }


    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }


    public String getDictTag() {
        return dictTag;
    }


    public void setDictTag(String dictTag) {
        this.dictTag = dictTag == null ? null : dictTag.trim();
    }


    public String getIsSys() {
        return isSys;
    }


    public void setIsSys(String isSys) {
        this.isSys = isSys == null ? null : isSys.trim();
    }


    public String getIsDefault() {
        return isDefault;
    }


    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }


    public String getTheDesc() {
        return theDesc;
    }


    public void setTheDesc(String theDesc) {
        this.theDesc = theDesc == null ? null : theDesc.trim();
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}