package com.moseeker.vo.dict.response;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2018/11/15
 * @Author: JackYang
 */
@ApiModel(value = "城市字典表")
@Data
public class DictCountryVO implements Serializable {

    public Integer id;
    public String  name;
    public String  ename;
    public String  isoCode_2;
    public String  isoCode_3;
    public String  code;
    public Byte    smsEnabled;
    public String  iconClass;
    public Byte    hotCountry;
    public Integer continentCode;
    public Short   priority;

}
