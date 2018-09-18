package com.moseeker.vo.company;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "重置密码信息")
public class ResetPasswordVO {

    private Integer accountId;
    @ApiModelProperty(value = "旧密码")
    private String originPassword;
    @ApiModelProperty(value = "新密码")
    private String password;
    private Integer companyId;

}
