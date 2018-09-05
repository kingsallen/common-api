package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCountryPO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created by jack on 2018/5/30.
 */
@Data
@ToString
@ApiModel
public class CountryVO {
    private Integer id;
    @ApiModelProperty(name = "name", value = "国家名称", dataType = "string")
    private String name;
    @ApiModelProperty(name = "ename", value = "国家英语名称", dataType = "string")
    private String ename;
    private String isoCode2;
    private String isoCode3;
    @ApiModelProperty(name = "code", value = "国家code", dataType = "string")
    private String code;
    private Boolean supportMobileMessage;
    @ApiModelProperty(name = "iconClass", value = "国旗样式", dataType = "string")
    private String iconClass;
    @ApiModelProperty(name = "hotCountry", value = "热门国家", dataType = "boolean")
    private Boolean hotCountry;
    @ApiModelProperty(name = "continentCode", value = "7大洲code", dataType = "Integer")
    private Integer continentCode;
    @ApiModelProperty(name = "priority", value = "优先级", dataType = "Integer")
    private Integer priority;

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
            setPriority(country.getPriority().intValue());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryVO)) return false;

        CountryVO country = (CountryVO) o;

        return getId().equals(country.getId());
    }

    @Override
    public int hashCode() {
        return getId();
    }
}
