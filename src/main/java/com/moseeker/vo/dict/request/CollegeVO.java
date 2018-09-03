package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictCollegePO;
import lombok.Data;
import lombok.ToString;

/**
 * @author cjm
 * @date 2018-08-31 14:19
 **/
@Data
@ToString
public class CollegeVO {
    private Integer code;
    private String  name;
    private Integer province;
    private String  logo;
    private Integer countryCode;

    public void cloneFromDictCollegePO(DictCollegePO dictCollegePO){
        setCode(dictCollegePO.getCode());
        setLogo(dictCollegePO.getLogo());
        setName(dictCollegePO.getName());
        setProvince(dictCollegePO.getProvince());
        setCountryCode(dictCollegePO.getCountryCode());
    }
}
