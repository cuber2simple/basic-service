package org.cuber.basic.dto;

import org.cuber.stub.json.GsonHolder;
import org.cuber.stub.repo.StubConfDTO;

import java.time.LocalDateTime;

/**
 * tableName   t_currency_4217
 * remark      币种表
 */
public class CurrencyEntity extends StubConfDTO {


    /**
     * column_name    alpha_code
     * remark         币种字母码
     */
    private String alphaCode;


    /**
     * column_name    number_code
     * remark         币种数字码
     */
    private String numberCode;


    /**
     * column_name    minor_unit
     * remark         币种最小单位
     */
    private Short minorUnit;


    /**
     * column_name    symbol_currency
     * remark         币种符号
     */
    private String symbolCurrency;


    /**
     * column_name    i18n_key
     * remark         币种I18N
     */
    private String i18nKey;


    /**
     * column_name    name
     * remark         币种中文名
     */
    private String name;


    /**
     * column_name    country
     * remark         币种使用实体
     */
    private String country;


    /**
     * column_name    grant_4_sale
     * remark         是否是交易币种Y/N
     */
    private String grant4Sale;


    /**
     * column_name    grant_4_settle
     * remark         是否是结算币种Y/N
     */
    private String grant4Settle;


    /**
     * column_name    update_datetime
     * remark         更新时间
     */
    private LocalDateTime updateDatetime;


    public String getAlphaCode() {
        return alphaCode;
    }


    public void setAlphaCode(String alphaCode) {
        this.alphaCode = alphaCode == null ? null : alphaCode.trim();
    }


    public String getNumberCode() {
        return numberCode;
    }


    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode == null ? null : numberCode.trim();
    }


    public Short getMinorUnit() {
        return minorUnit;
    }


    public void setMinorUnit(Short minorUnit) {
        this.minorUnit = minorUnit;
    }


    public String getSymbolCurrency() {
        return symbolCurrency;
    }


    public void setSymbolCurrency(String symbolCurrency) {
        this.symbolCurrency = symbolCurrency == null ? null : symbolCurrency.trim();
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


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }


    public String getGrant4Sale() {
        return grant4Sale;
    }


    public void setGrant4Sale(String grant4Sale) {
        this.grant4Sale = grant4Sale == null ? null : grant4Sale.trim();
    }


    public String getGrant4Settle() {
        return grant4Settle;
    }


    public void setGrant4Settle(String grant4Settle) {
        this.grant4Settle = grant4Settle == null ? null : grant4Settle.trim();
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