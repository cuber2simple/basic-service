package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

/**
 * tableName   t_biz_table_def
 * remark      业务表配置
 */
public class BizTableDefEntity extends StubConfDTO {


    /**
     * column_name    table_name
     * remark         表名
     */
    private String tableName;


    /**
     * column_name    schema
     * remark         库名
     */
    private String schema;


    /**
     * column_name    app_name
     * remark         服务名
     */
    private String appName;


    /**
     * column_name    t_class
     * remark         类全名
     */
    private String tClass;


    /**
     * column_name    pattern
     * remark         分表模式 yyyy_MM, yyyy_MM_dd
     */
    private String pattern;


    /**
     * column_name    biz_code
     * remark         业务CODE(0-31)
     */
    private Short bizCode;


    /**
     * column_name    prefix
     * remark         ID前缀
     */
    private String prefix;


    /**
     * column_name    the_desc
     * remark         业务分表描述
     */
    private String theDesc;


    /**
     * column_name    is_sys
     * remark         是否系统
     */
    private String isSys;


    public String getTableName() {
        return tableName;
    }


    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }


    public String getSchema() {
        return schema;
    }


    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }


    public String getAppName() {
        return appName;
    }


    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }


    public String gettClass() {
        return tClass;
    }


    public void settClass(String tClass) {
        this.tClass = tClass == null ? null : tClass.trim();
    }


    public String getPattern() {
        return pattern;
    }


    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }


    public Short getBizCode() {
        return bizCode;
    }


    public void setBizCode(Short bizCode) {
        this.bizCode = bizCode;
    }


    public String getPrefix() {
        return prefix;
    }


    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
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

    @Override
    public String toString() {
        return GsonHolder.toJson(this);
    }
}