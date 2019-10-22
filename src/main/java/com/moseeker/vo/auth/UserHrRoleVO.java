package com.moseeker.vo.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserHrRoleVO {
    @ApiModelProperty(value = "角色id", dataType = "java.lang.Integer")
    private Integer roleId;
    @ApiModelProperty(value = "角色名")
    private String roleName;
    @ApiModelProperty(value = "角色描述")
    private String roleDesc;
    @ApiModelProperty(value = "1:超级管理员 2:管理员 3:招聘负责人 4:高级用人经理 5:用人经理 6:面试官 7:自定义角色", dataType = "java.lang.Integer")
    private Byte roleType;
}
