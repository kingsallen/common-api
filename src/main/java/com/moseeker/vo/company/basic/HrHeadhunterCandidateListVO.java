package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;

/**
 * HrHeadhunterCandidateListVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("候选人列表VO")
public class HrHeadhunterCandidateListVO {
    @ApiModelProperty(value = "hrId")
    private Integer hrId;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "猎头公司id")
    private Integer headhunterCompanyId;
    @ApiModelProperty(value = "申请职位")
    private Integer [] positionIds;
    @ApiModelProperty(value = "推荐开始时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp startTime;
    @ApiModelProperty(value = "推荐结束时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp endTime;
    @ApiModelProperty(value = "候选人名称")
    private String name;
    @ApiModelProperty(value = "每页条数")
    private Integer pageSize;
    @ApiModelProperty(value = "当前页码")
    private Integer pageNum;
}
