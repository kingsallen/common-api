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
@ApiModel(description = "HR微信登录信息")
public class HrWxLoginReqVO {

    @ApiModelProperty(value = "微信unionid", required = true)
    private  String unionid;
    @ApiModelProperty(value = "绑定的公众号编号", required = true)
    private Integer wechatId;
    @ApiModelProperty(value = "登录ip", required = true)
    private String lastLoginIp;

}
