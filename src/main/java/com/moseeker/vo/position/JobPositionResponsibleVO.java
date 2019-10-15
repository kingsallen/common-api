package com.moseeker.vo.position;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class JobPositionResponsibleVO {
    @ApiModelProperty(value = "职位id")
    private Integer  positionId;
    @ApiModelProperty(value = "招聘负责人id")
    private Integer  publisher;
    @ApiModelProperty(value = "招聘协调人id")
    private List<Integer> coordinatorId;
    @ApiModelProperty(value = "用人经理id")
    private List<Integer>  managerId;
    @ApiModelProperty(value = "面试官id")
    private List<Integer>  interviewerId;
}
