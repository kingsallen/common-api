package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("猎头端候选人表单VO")
public class HeadhunterCandidateFormVO {

    @ApiModelProperty(value = "猎头职位Id")
    private Integer jobId;
    @ApiModelProperty(value = "猎头账号Id")
    private Integer headhunterId;
    @ApiModelProperty(value = "搜索关键字")
    private String keyword;
    @ApiModelProperty(value = "当前状态")
    private Integer status;
    @ApiModelProperty(value = "每页条数")
    private Integer pageSize;
    @ApiModelProperty(value = "当前页码")
    private Integer pageNum;
}
