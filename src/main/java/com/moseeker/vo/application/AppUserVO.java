package com.moseeker.vo.application;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AppUserVO {
    @ApiModelProperty(value = "申请id", dataType = "int")
    private Integer   id;
    @ApiModelProperty(value = "sys_user.id, 用户ID", dataType = "int")
    private Integer   applierId;
}
