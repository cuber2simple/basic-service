package org.cuber.basic.dto;

import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_cache_def
 * remark      缓存表
 */
public class CacheDefEntity extends StubConfDTO {


    /**
     * column_name    cache_name
     * remark         缓存名
     */
    private String cacheName;


    /**
     * column_name    app_name
     * remark         所在服务名
     */
    private String appName;


    /**
     * column_name    cache_zk_path
     * remark         缓存在的zookeeper path 用于更新全局缓存,比如说国家之类的通知监听地址,不是全局可置为空
     */
    private String cacheZkPath;


    /**
     * column_name    cache_redis_key
     * remark         缓存在的redis_key
     */
    private String cacheRedisKey;


    /**
     * column_name    cache_ins_class
     * remark         缓存的class类名
     */
    private String cacheInsClass;


    /**
     * column_name    bridge_class
     * remark         缓存的bridge类名
     */
    private String bridgeClass;


    /**
     * column_name    carrier_class
     * remark         carrier类
     */
    private String carrierClass;


    /**
     * column_name    field_keys
     * remark         缓存的key值;分割为key,为联合field key
     */
    private String fieldKeys;


    /**
     * column_name    is_global
     * remark         是否全局缓存  Y/N
     */
    private String isGlobal;


    /**
     * column_name    is_durable
     * remark         是否长期缓存  Y/N  长期缓存不需要过期时间
     */
    private String isDurable;


    /**
     * column_name    duration_of_minutes
     * remark         过期分钟
     */
    private Integer durationOfMinutes;


    /**
     * column_name    last_load_datetime
     * remark         最后一次更新时间
     */
    private LocalDateTime lastLoadDatetime;


    /**
     * column_name    update_datetime
     * remark
     */
    private LocalDateTime updateDatetime;


    public String getCacheName() {
        return cacheName;
    }


    public void setCacheName(String cacheName) {
        this.cacheName = cacheName == null ? null : cacheName.trim();
    }


    public String getAppName() {
        return appName;
    }


    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }


    public String getCacheZkPath() {
        return cacheZkPath;
    }


    public void setCacheZkPath(String cacheZkPath) {
        this.cacheZkPath = cacheZkPath == null ? null : cacheZkPath.trim();
    }


    public String getCacheRedisKey() {
        return cacheRedisKey;
    }


    public void setCacheRedisKey(String cacheRedisKey) {
        this.cacheRedisKey = cacheRedisKey == null ? null : cacheRedisKey.trim();
    }


    public String getCacheInsClass() {
        return cacheInsClass;
    }


    public void setCacheInsClass(String cacheInsClass) {
        this.cacheInsClass = cacheInsClass == null ? null : cacheInsClass.trim();
    }


    public String getBridgeClass() {
        return bridgeClass;
    }


    public void setBridgeClass(String bridgeClass) {
        this.bridgeClass = bridgeClass == null ? null : bridgeClass.trim();
    }


    public String getCarrierClass() {
        return carrierClass;
    }


    public void setCarrierClass(String carrierClass) {
        this.carrierClass = carrierClass == null ? null : carrierClass.trim();
    }


    public String getFieldKeys() {
        return fieldKeys;
    }


    public void setFieldKeys(String fieldKeys) {
        this.fieldKeys = fieldKeys == null ? null : fieldKeys.trim();
    }


    public String getIsGlobal() {
        return isGlobal;
    }


    public void setIsGlobal(String isGlobal) {
        this.isGlobal = isGlobal == null ? null : isGlobal.trim();
    }


    public String getIsDurable() {
        return isDurable;
    }


    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable == null ? null : isDurable.trim();
    }


    public Integer getDurationOfMinutes() {
        return durationOfMinutes;
    }


    public void setDurationOfMinutes(Integer durationOfMinutes) {
        this.durationOfMinutes = durationOfMinutes;
    }


    public LocalDateTime getLastLoadDatetime() {
        return lastLoadDatetime;
    }


    public void setLastLoadDatetime(LocalDateTime lastLoadDatetime) {
        this.lastLoadDatetime = lastLoadDatetime;
    }


    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }


    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}