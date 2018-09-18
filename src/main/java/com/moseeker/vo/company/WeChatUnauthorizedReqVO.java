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
@ApiModel(description = "解绑公众号信息")
public class WeChatUnauthorizedReqVO {

    @ApiModelProperty(value = "开发者appid", required = true)
    private String  appid;
    @ApiModelProperty(value = "是否授权0：无关，1：授权2：解除授权", required = true)
    private Byte authorized;
    @ApiModelProperty(value = "解除授权的时间戳")
    private Integer unauthorizedTime;


}
