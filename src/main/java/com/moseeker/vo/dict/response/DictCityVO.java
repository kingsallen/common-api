package com.moseeker.vo.dict.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zztaiwll on 18/8/15.
 */
@ApiModel(value = "城市字典数据模型")
@Data
public class DictCityVO implements Serializable {

    private static final long serialVersionUID = 786604284;
    @ApiModelProperty(value ="字典code",required = false)
    private Integer code;
    @ApiModelProperty(value ="字典name",required = false)
    private String  name;
    @ApiModelProperty(value ="字典level",required = false)
    private Integer     level;
    @ApiModelProperty(value ="热门城市 0:否 1：是",required = false)
    private Integer     hotCity;
    @ApiModelProperty(value ="英文名称",required = false)
    private String  ename;
    @ApiModelProperty(value ="正在使用 0:没在用 1:在使用",required = false)
    private Integer     isUsing;


}