package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCountryPO;

/**
 * Created by jack on 2018/5/30.
 */
public class CountryVO {
    private int id;
    private String name;
    private String ename;
    private String isoCode2;
    private String isoCode3;
    private String code;
    private boolean supportMobileMessage;
    private String iconClass;
    private boolean hotCountry;
    private int continentCode;
    private int priority;

    public void cloneFromDictCountry(DictCountryPO country) {
        if (country == null) {
            return;
        }
        if (country.getId() != null) {
            setId(country.getId());
        }
        setName(country.getName());
        setEname(country.getEname());
        setIsoCode2(country.getIsoCode_2());
        setIsoCode3(country.getIsoCode_3());
        setCode(country.getCode());
        setSupportMobileMessage(country.getSmsEnabled() == 1);
        setIconClass(country.getIconClass());
        setHotCountry(country.getHotCountry() == 1);
        if (country.getContinentCode() != null) {
            setContinentCode(country.getContinentCode());
        }
        if (country.getPriority() != null) {
            setPriority(country.getPriority());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryVO)) return false;

        CountryVO country = (CountryVO) o;

        return getId() == country.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getIsoCode2() {
        return isoCode2;
    }

    public void setIsoCode2(String isoCode2) {
        this.isoCode2 = isoCode2;
    }

    public String getIsoCode3() {
        return isoCode3;
    }

    public void setIsoCode3(String isoCode3) {
        this.isoCode3 = isoCode3;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSupportMobileMessage() {
        return supportMobileMessage;
    }

    public void setSupportMobileMessage(boolean supportMobileMessage) {
        this.supportMobileMessage = supportMobileMessage;
    }

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public boolean isHotCountry() {
        return hotCountry;
    }

    public void setHotCountry(boolean hotCountry) {
        this.hotCountry = hotCountry;
    }

    public int getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(int continentCode) {
        this.continentCode = continentCode;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
