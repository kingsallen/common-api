package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCollegePO;
import com.moseeker.vo.dict.response.DictCollegeVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author cjm
 * @date 2018-08-31 14:19
 **/
@Data
@ToString
@ApiModel
public class CollegeVO {
    @ApiModelProperty(name = "code", value = "院校code", dataType = "Integer")
    private Integer code;
    @ApiModelProperty(name = "name", value = "院校名字", dataType = "string")
    private String  name;
    @ApiModelProperty(name = "province", value = "院校省份", dataType = "Integer")
    private Integer province;
    @ApiModelProperty(name = "logo", value = "院校logo", dataType = "string")
    private String  logo;
    @ApiModelProperty(name = "countryCode", value = "院校所属国家code", dataType = "Integer")
    private Integer countryCode;

    public void cloneFromDictCollegePO(DictCollegePO dictCollegePO){
        setCode(dictCollegePO.getCode());
        setLogo(dictCollegePO.getLogo());
        setName(dictCollegePO.getName());
        setProvince(dictCollegePO.getProvince());
        setCountryCode(dictCollegePO.getCountryCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeVO)) return false;

        CollegeVO college = (CollegeVO) o;

        return getCode().equals(college.getCode());
    }

    @Override
    public int hashCode() {
        return getCode();
    }
}
