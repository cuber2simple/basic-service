package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_app_def
 * remark      服务表
 */
public class AppDefEntity extends StubConfDTO {


    /**
     * column_name    app_name
     * remark         服务名
     */
    private String appName;


    /**
     * column_name    group_name
     * remark         服务分组名
     */
    private String groupName;


    /**
     * column_name    own_user_id
     * remark         服务owner用户
     */
    private String ownUserId;


    /**
     * column_name    server_port
     * remark         服务端口
     */
    private Short serverPort;


    /**
     * column_name    dubbo_port
     * remark         dubbo端口
     */
    private Integer dubboPort;


    /**
     * column_name    kafka_topic
     * remark         kafka话题,通常用于任务下发
     */
    private String kafkaTopic;


    /**
     * column_name    ext_setting
     * remark         额外设置
     */
    private String extSetting;


    /**
     * column_name    ext1_setting
     * remark         额外设置1
     */
    private String ext1Setting;


    /**
     * column_name    context_path
     * remark         服务前缀
     */
    private String contextPath;


    /**
     * column_name    app_desc
     * remark         服务描述
     */
    private String appDesc;


    /**
     * column_name    update_datetime
     * remark
     */
    private LocalDateTime updateDatetime;


    public String getAppName() {
        return appName;
    }


    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }


    public String getGroupName() {
        return groupName;
    }


    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }


    public String getOwnUserId() {
        return ownUserId;
    }


    public void setOwnUserId(String ownUserId) {
        this.ownUserId = ownUserId == null ? null : ownUserId.trim();
    }


    public Short getServerPort() {
        return serverPort;
    }


    public void setServerPort(Short serverPort) {
        this.serverPort = serverPort;
    }


    public Integer getDubboPort() {
        return dubboPort;
    }


    public void setDubboPort(Integer dubboPort) {
        this.dubboPort = dubboPort;
    }


    public String getKafkaTopic() {
        return kafkaTopic;
    }


    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic == null ? null : kafkaTopic.trim();
    }


    public String getExtSetting() {
        return extSetting;
    }


    public void setExtSetting(String extSetting) {
        this.extSetting = extSetting == null ? null : extSetting.trim();
    }


    public String getExt1Setting() {
        return ext1Setting;
    }


    public void setExt1Setting(String ext1Setting) {
        this.ext1Setting = ext1Setting == null ? null : ext1Setting.trim();
    }


    public String getContextPath() {
        return contextPath;
    }


    public void setContextPath(String contextPath) {
        this.contextPath = contextPath == null ? null : contextPath.trim();
    }


    public String getAppDesc() {
        return appDesc;
    }


    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc == null ? null : appDesc.trim();
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