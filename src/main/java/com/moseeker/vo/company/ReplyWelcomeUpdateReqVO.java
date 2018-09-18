package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/12.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "修改公众号欢迎语信息")
public class ReplyWelcomeUpdateReqVO {

    @ApiModelProperty(value = "回复规则编号，hr_wx_rule.id", required = true)
    private Integer rid;
    @ApiModelProperty(value = "回复类型 welcome  default", required = true)
    private String type;
    @ApiModelProperty(value = "公众号变阿豪", required = true)
    private Integer wechatId;

}
