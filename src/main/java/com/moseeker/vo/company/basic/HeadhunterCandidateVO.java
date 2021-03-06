package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("猎头端候选人信息")
public class HeadhunterCandidateVO {

    @ApiModelProperty(name = "id", value = "候选人Id")
    private Integer id;
    @ApiModelProperty(value = "候选人名称")
    private String candidateName;
    @ApiModelProperty(value = "当前公司名称")
    private String companyName;
    @ApiModelProperty(value = "当前职位")
    private String positionName;
    @ApiModelProperty(value = "推荐说明")
    private String recommendDesc;
    @ApiModelProperty(value = "当前状态")
    private Integer status;
    @ApiModelProperty(value = "操作信息")
    private String operationInfo;
    @ApiModelProperty(value = "推荐时间")
    private String recommendTime;
    @ApiModelProperty(value = "用户id， user_user.id")
    private Integer userId;
    @ApiModelProperty(name = "jobId", value = "hr职位id， job_position.id")
    private Integer jobId;
}
