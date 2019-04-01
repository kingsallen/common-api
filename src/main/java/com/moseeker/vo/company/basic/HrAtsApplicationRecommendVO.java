package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel("推荐用人部门初筛申请记录数据模型")
public class HrAtsApplicationRecommendVO {

    @ApiModelProperty(value = "主键编号",required = true)
    private Integer   id;
    @ApiModelProperty(value = "申请id",required = true)
    private Integer   applicationId;
    @ApiModelProperty(value = "hr编号",required = true)
    private Integer   hrId;
    @ApiModelProperty(value = "面试官id",required = true)
    private Integer   interviewerId;
    @ApiModelProperty(value = "初筛结果 0 未反馈 1 初筛通过 2 淘汰",required = true)
    private Integer   recommendStatus;
    @ApiModelProperty(name = "disable",value ="状态：0 有效  1 无效 2 逻辑删除",required = true)
    private Integer   disable;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}