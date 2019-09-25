package com.moseeker.vo.company.response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("猎头相关信息")
public class HrHunterInfo {
    @ApiModelProperty(name = "userId",value = "用户编号")
    private int userId;
    @ApiModelProperty(name = "hunterName",value = "猎头姓名")
    private String hunterName;
    @ApiModelProperty(name = "hunterCompanyName",value = "猎头公司")
    private String hunterCompanyName;
    @ApiModelProperty(name = "hunterEmail",value = "猎头邮箱")
    private String hunterEmail;
    @ApiModelProperty(name = "positionId",value = "职位id")
    private int positionid;
}
