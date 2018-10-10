package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "企业微信公众号菜单颜色配置")
public class ColorDataVO {

    @ApiModelProperty(value = "configdb.config_sys_theme.id")
    private Integer id;
    @ApiModelProperty(value = "部门主题颜色 0 背景色, 1 title color, 2 button color, 3 other color")
    private List<String> colors;
    @ApiModelProperty(value = "是否免费 0：免费 1：收费，只能在大岂后台操作收费主题")
    private Integer type;

}
