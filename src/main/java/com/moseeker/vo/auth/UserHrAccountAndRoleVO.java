package com.moseeker.vo.auth;

import com.moseeker.vo.company.basic.UserHrAccountVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "Hr信息和角色信息")
public class UserHrAccountAndRoleVO extends UserHrAccountVO {
    @ApiModelProperty(value="角色信息")
    private UserHrRoleVO role;
}
