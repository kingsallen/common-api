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
public class ThemeColorVO {
    private List<ColorDataVO> colorList;
    @ApiModelProperty(value = "用于表示是否可以开启企业自定义颜色配置 false 否 true开启")
    private boolean customrized;
    @ApiModelProperty(value =  "config_sys_theme.id")
    private Integer selectedId;

}
