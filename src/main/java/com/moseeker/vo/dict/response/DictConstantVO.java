package com.moseeker.vo.dict.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zztaiwll on 18/5/18.
 */
@ApiModel(value = "通用字典表")
@Data
public class DictConstantVO implements Serializable {
    private static final long serialVersionUID = 1148724583;
    @ApiModelProperty(value = "主key",required = false)
    private Integer       id;
    @ApiModelProperty(value = "字典code",required = false)
    private Integer       code;
    @ApiModelProperty(value = "字典name",required = false)
    private String    name;
    @ApiModelProperty(value = "优先级",required = false)
    private Byte      priority;
    @ApiModelProperty(value = "父级字典code",required = false)
    private Integer       parentCode;
    private Timestamp createTime;
    private Timestamp updateTime;


}
