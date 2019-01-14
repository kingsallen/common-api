package com.moseeker.vo.dict.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zztaiwll on 18/8/15.
 */
@ApiModel(value = "城市字典数据模型")
@Data
public class DictCityVO implements Serializable {

    private static final long serialVersionUID = 786604284;
    @ApiModelProperty(value = "city_code", name = "code", dataType = "Integer")
    private Integer code;
    @ApiModelProperty(value = "city_name", name = "name", dataType = "string")
    private String name;
    @ApiModelProperty(value = "city_level", name = "level", dataType = "Integer")
    private Integer level;
    @ApiModelProperty(value = "is_hot_city", name = "hotCity", dataType = "Boolean")
    private Boolean hotCity;
    @ApiModelProperty(value = "英语城市名", name = "ename", dataType = "string")
    private String ename;
    @ApiModelProperty(value = "is_using 0:没在用 1:在使用", name = "isUsing", dataType = "Boolean")
    private Boolean isUsing;

    private List<DictCityVO> cities;
}