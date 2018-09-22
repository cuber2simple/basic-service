package  org.cuber.basic.vo;

import  java.time.LocalDateTime;
import  org.cuber.stub.vo.StubConfVO;
import  io.swagger.annotations.ApiModel;
import  java.lang.String;
import  java.lang.Integer;
import  io.swagger.annotations.ApiModelProperty;

@ApiModel("缓存表")
public class CacheDefEntityVO  extends StubConfVO {

    private static final long serialVersionUID = 6617118362562192384l;

    @ApiModelProperty("缓存名")
    private String cacheName;
    @ApiModelProperty("所在服务名")
    private String appName;
    @ApiModelProperty("缓存在的zookeeper path 用于更新全局缓存,比如说国家之类的通知监听地址,不是全局可置为空")
    private String cacheZkPath;
    @ApiModelProperty("缓存在的redis_key")
    private String cacheRedisKey;
    @ApiModelProperty("缓存的class类名")
    private String cacheInsClass;
    @ApiModelProperty("缓存的bridge类名")
    private String bridgeClass;
    @ApiModelProperty("carrier类")
    private String carrierClass;
    @ApiModelProperty("缓存的key值;分割为key,为联合field key")
    private String fieldKeys;
    @ApiModelProperty("是否全局缓存  Y/N")
    private String isGlobal;
    @ApiModelProperty("是否长期缓存  Y/N  长期缓存不需要过期时间")
    private String isDurable;
    @ApiModelProperty("过期分钟")
    private Integer durationOfMinutes;
    @ApiModelProperty("最后一次更新时间")
    private LocalDateTime lastLoadDatetime;

    public String getCacheName(){
        return cacheName;
    }


    public void setCacheName(String cacheName){
       this.cacheName = cacheName == null ? null : cacheName.trim();
    }


    public String getAppName(){
        return appName;
    }


    public void setAppName(String appName){
       this.appName = appName == null ? null : appName.trim();
    }


    public String getCacheZkPath(){
        return cacheZkPath;
    }


    public void setCacheZkPath(String cacheZkPath){
       this.cacheZkPath = cacheZkPath == null ? null : cacheZkPath.trim();
    }


    public String getCacheRedisKey(){
        return cacheRedisKey;
    }


    public void setCacheRedisKey(String cacheRedisKey){
       this.cacheRedisKey = cacheRedisKey == null ? null : cacheRedisKey.trim();
    }


    public String getCacheInsClass(){
        return cacheInsClass;
    }


    public void setCacheInsClass(String cacheInsClass){
       this.cacheInsClass = cacheInsClass == null ? null : cacheInsClass.trim();
    }


    public String getBridgeClass(){
        return bridgeClass;
    }


    public void setBridgeClass(String bridgeClass){
       this.bridgeClass = bridgeClass == null ? null : bridgeClass.trim();
    }


    public String getCarrierClass(){
        return carrierClass;
    }


    public void setCarrierClass(String carrierClass){
       this.carrierClass = carrierClass == null ? null : carrierClass.trim();
    }


    public String getFieldKeys(){
        return fieldKeys;
    }


    public void setFieldKeys(String fieldKeys){
       this.fieldKeys = fieldKeys == null ? null : fieldKeys.trim();
    }


    public String getIsGlobal(){
        return isGlobal;
    }


    public void setIsGlobal(String isGlobal){
       this.isGlobal = isGlobal == null ? null : isGlobal.trim();
    }


    public String getIsDurable(){
        return isDurable;
    }


    public void setIsDurable(String isDurable){
       this.isDurable = isDurable == null ? null : isDurable.trim();
    }


    public Integer getDurationOfMinutes(){
        return durationOfMinutes;
    }


    public void setDurationOfMinutes(Integer durationOfMinutes){
        this.durationOfMinutes = durationOfMinutes;
    }


    public LocalDateTime getLastLoadDatetime(){
        return lastLoadDatetime;
    }


    public void setLastLoadDatetime(LocalDateTime lastLoadDatetime){
        this.lastLoadDatetime = lastLoadDatetime;
    }



}