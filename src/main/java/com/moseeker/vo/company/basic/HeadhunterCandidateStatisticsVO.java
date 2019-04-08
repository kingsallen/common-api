package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

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
    @ApiModelProperty(value = "总人数")
    private Integer total;
    private List<HeadhunterCandidateProcessVO> process;
}
