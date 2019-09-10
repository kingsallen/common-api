package com.moseeker.vo.auth;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "账号类型-角色映射信息")
public class UserAccountTypeRoleMapVO extends UserHrRoleVO {
    @ApiModelProperty(value = "账号类型", dataType = "java.lang.Integer")
    private Integer accountType;
}
