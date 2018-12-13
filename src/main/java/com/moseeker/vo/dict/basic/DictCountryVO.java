package com.moseeker.vo.dict.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2018/11/15
 * @Author: JackYang
 */
@ApiModel(value = "城市字典表")
@Data
public class DictCountryVO implements Serializable {

    private static final long serialVersionUID = -8871792540013756948L;
    private Integer id;
    @ApiModelProperty(name = "name", value = "国家名称", dataType = "string")
    private String name;
    @ApiModelProperty(name = "ename", value = "国家英语名称", dataType = "string")
    private String ename;
    private String isoCode_2;
    private String isoCode_3;
    @ApiModelProperty(name = "code", value = "国家code", dataType = "string")
    private String code;
    private Boolean smsEnabled;
    @ApiModelProperty(name = "iconClass", value = "国旗样式", dataType = "string")
    private String iconClass;
    @ApiModelProperty(name = "hotCountry", value = "热门国家", dataType = "boolean")
    private Boolean hotCountry;
    @ApiModelProperty(name = "continentCode", value = "7大洲code", dataType = "Integer")
    private Integer continentCode;
    @ApiModelProperty(name = "priority", value = "优先级", dataType = "Integer")
    private Integer priority;

}
