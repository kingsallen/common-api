package com.moseeker.vo.dict.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ProfileEducationServiceImpl
 *
 * @Author: lee
 * @Date: 2018/11/27
 */
@ApiModel(value = "专业字典表")
@Data
public class DictMajorVO implements Serializable {

    private static final long serialVersionUID = 9109470338367353311L;
    @ApiModelProperty(value = "字典code", name = "code", dataType = "Integer")
    private Integer code;
    @ApiModelProperty(value = "字典name", name = "name", dataType = "string")
    private String name;
    @ApiModelProperty(value = "字典level", name = "level", dataType = "Integer")
    private Integer level;
}