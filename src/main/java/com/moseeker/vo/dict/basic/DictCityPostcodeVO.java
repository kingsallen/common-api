package com.moseeker.vo.dict.basic;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;


@ApiModel(value = "城市邮编字典数据模型")
@Data
public class DictCityPostcodeVO implements Serializable {

    private static final long serialVersionUID = 2946298890737128039L;
    private Integer id;
    private String  postcode;
    private String  province;
    private String  city;
    private String  district;
    private String  code;
}
