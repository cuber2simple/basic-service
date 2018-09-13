package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_dict_data
 * remark      字典数据表
 */
public class DictDataEntity extends StubConfDTO {


    /**
     * column_name    dict_code
     * remark         字典编码
     */
    private String dictCode;


    /**
     * column_name    parent_code
     * remark         父节点编码
     */
    private String parentCode;


    /**
     * column_name    tree_sort
     * remark         树排序
     */
    private Short treeSort;


    /**
     * column_name    tree_leaf
     * remark         是否叶子节点  Y/N
     */
    private String treeLeaf;


    /**
     * column_name    tree_level
     * remark         叶子深度
     */
    private Short treeLevel;


    /**
     * column_name    dict_label
     * remark         字典标志
     */
    private String dictLabel;


    /**
     * column_name    dict_value
     * remark         字典值
     */
    private String dictValue;


    /**
     * column_name    dict_type
     * remark         字典类型
     */
    private String dictType;


    /**
     * column_name    dict_tag
     * remark         字典标识
     */
    private String dictTag;


    /**
     * column_name    is_sys
     * remark         是否系统使用 Y/N
     */
    private String isSys;


    /**
     * column_name    is_default
     * remark         是否默认选中 Y/N
     */
    private String isDefault;


    /**
     * column_name    the_desc
     * remark         描述
     */
    private String theDesc;


    /**
     * column_name    update_datetime
     * remark         更新时间
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


    public String getDictType() {
        return dictType;
    }


    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
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

    @Override
    public String toString() {
        return GsonHolder.toJson(this);
    }
}