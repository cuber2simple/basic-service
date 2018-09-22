package org.cuber.basic.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.cuber.stub.json.JacksonHolder;

import java.io.Serializable;

@ApiModel("IP对象")
public class Ip implements Serializable {

    private static final long serialVersionUID = 4954724502269438093L;

    @ApiModelProperty(value = "IP")
    private String ip;

    @ApiModelProperty(value = "是否是IPV4")
    private boolean isIpV4;

    @ApiModelProperty(value = "IP所在国家alpha2")
    private String countryCode;

    @ApiModelProperty(value = "IP所在国家名")
    private String countryName;

    @ApiModelProperty(value = "IP所在省")
    private String stateProv;

    @ApiModelProperty(value = "IP所在地区")
    private String district;

    @ApiModelProperty(value = "IP所在城市")
    private String city;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isIpV4() {
        return isIpV4;
    }

    public void setIpV4(boolean ipV4) {
        isIpV4 = ipV4;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String stateProv) {
        this.stateProv = stateProv;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return JacksonHolder.toJackson(this);
    }
}
