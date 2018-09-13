package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_country_3166
 * remark      国家表
 */
public class CountryEntity extends StubConfDTO {


    /**
     * column_name    alpha_code_2
     * remark         国家2字码
     */
    private String alphaCode2;


    /**
     * column_name    alpha_code_3
     * remark         国家3字码
     */
    private String alphaCode3;


    /**
     * column_name    number_code
     * remark         国家数字码
     */
    private String numberCode;


    /**
     * column_name    iso3166_2
     * remark         国家3166-2字码
     */
    private String iso31662;


    /**
     * column_name    i18n_key
     * remark         国家I18N
     */
    private String i18nKey;


    /**
     * column_name    name
     * remark         国家英文名
     */
    private String name;


    /**
     * column_name    region
     * remark         国家地区
     */
    private String region;


    /**
     * column_name    sub_region
     * remark         国家子地区
     */
    private String subRegion;


    /**
     * column_name    intermediate_region
     * remark         国家中间地区
     */
    private String intermediateRegion;


    /**
     * column_name    region_code
     * remark         国家地区编码
     */
    private String regionCode;


    /**
     * column_name    sub_region_code
     * remark         国家子地区编码
     */
    private String subRegionCode;


    /**
     * column_name    intermediate_region_code
     * remark         国家中间地区编码
     */
    private String intermediateRegionCode;


    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getAlphaCode2() {
        return alphaCode2;
    }


    public void setAlphaCode2(String alphaCode2) {
        this.alphaCode2 = alphaCode2 == null ? null : alphaCode2.trim();
    }


    public String getAlphaCode3() {
        return alphaCode3;
    }


    public void setAlphaCode3(String alphaCode3) {
        this.alphaCode3 = alphaCode3 == null ? null : alphaCode3.trim();
    }


    public String getNumberCode() {
        return numberCode;
    }


    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode == null ? null : numberCode.trim();
    }


    public String getIso31662() {
        return iso31662;
    }


    public void setIso31662(String iso31662) {
        this.iso31662 = iso31662 == null ? null : iso31662.trim();
    }


    public String getI18nKey() {
        return i18nKey;
    }


    public void setI18nKey(String i18nKey) {
        this.i18nKey = i18nKey == null ? null : i18nKey.trim();
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public String getRegion() {
        return region;
    }


    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }


    public String getSubRegion() {
        return subRegion;
    }


    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion == null ? null : subRegion.trim();
    }


    public String getIntermediateRegion() {
        return intermediateRegion;
    }


    public void setIntermediateRegion(String intermediateRegion) {
        this.intermediateRegion = intermediateRegion == null ? null : intermediateRegion.trim();
    }


    public String getRegionCode() {
        return regionCode;
    }


    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }


    public String getSubRegionCode() {
        return subRegionCode;
    }


    public void setSubRegionCode(String subRegionCode) {
        this.subRegionCode = subRegionCode == null ? null : subRegionCode.trim();
    }


    public String getIntermediateRegionCode() {
        return intermediateRegionCode;
    }


    public void setIntermediateRegionCode(String intermediateRegionCode) {
        this.intermediateRegionCode = intermediateRegionCode == null ? null : intermediateRegionCode.trim();
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