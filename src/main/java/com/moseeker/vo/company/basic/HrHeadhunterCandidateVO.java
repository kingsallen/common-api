package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HrHeadhunterCandidateVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("Hr查看的候选人数据")
public class HrHeadhunterCandidateVO {

    @ApiModelProperty(name = "id", value = "候选人id")
    private Integer id;
    @ApiModelProperty(value = "候选人名称")
    private String candidateName;
    @ApiModelProperty(value = "猎头公司名称")
    private String headhunterCompanyName;
    @ApiModelProperty(value = "猎头顾问")
    private String headhunterName;
    @ApiModelProperty(value = "剩余保护期")
    private Integer termOfProtection;
    @ApiModelProperty(value = "推荐说明")
    private String recommendDesc;
    @ApiModelProperty(value = "申请职位")
    private String positionName;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "操作信息")
    private String operationInfo;
    @ApiModelProperty(value = "猎头费用")
    private Double cost;
    @ApiModelProperty(value = "推荐时间")
    private String recommendTime;
    @ApiModelProperty(value = "用户id， user_user.id")
    private Integer userId;
    @ApiModelProperty(name = "appTplId", value = "appTplId")
    private Integer appTplId;
    @ApiModelProperty(value = "接收时间")
    private String receiveTime;
    @ApiModelProperty(name = "applicationId", value = "申请id")
    private Integer applicationId;


}
