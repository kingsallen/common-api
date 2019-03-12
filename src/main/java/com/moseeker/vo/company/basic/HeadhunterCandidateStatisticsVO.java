package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterCandidateStatisticsVO
 *
 * @Author: lee
 * @Date: 2019/3/6
 */
@Data
@ApiModel("候选人统计数据")
public class HeadhunterCandidateStatisticsVO {
    @ApiModelProperty(value = "猎头账号Id hr_headhunter_account.id")
    private Integer headhunterId;
    @ApiModelProperty(value = "猎头职位Id hr_headhunter_job.id")
    private Integer jobId;
    @ApiModelProperty(value = "初筛人数")
    private Integer screenCount;
    @ApiModelProperty(value = "面试人数")
    private Integer interviewCount;
    @ApiModelProperty(value = "offer人数")
    private Integer offerCount;
    @ApiModelProperty(value = "入职人数")
    private Integer entryCount;
    @ApiModelProperty(value = "淘汰人数")
    private Integer refuseCount;
    @ApiModelProperty(value = "总人数")
    private Integer totalCount;
}
