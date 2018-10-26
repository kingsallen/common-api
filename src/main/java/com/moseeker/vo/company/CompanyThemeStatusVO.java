package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by moseeker on 2018/10/10.
 */
@Data
@ApiModel(description = "修改公司微信公众号主题色状态信息")
public class CompanyThemeStatusVO {

    @ApiModelProperty(value = "公司编号", required = true)
    private Integer companyId;
    @ApiModelProperty(value = "表示是否可以开启企业自定义颜色配置 0是否 1是开启 (用于 修改公司的自定义颜色配置开关接口)")
    private Integer status;
}
