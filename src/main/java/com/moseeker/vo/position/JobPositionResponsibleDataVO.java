package com.moseeker.vo.position;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class JobPositionResponsibleDataVO {
    @ApiModelProperty(value = "职位id")
    private Integer  positionId;
    @ApiModelProperty(value = "招聘负责人id")
    private Integer  publisher;
    @ApiModelProperty(value = "招聘协调人id")
    private String  coordinatorId;
    @ApiModelProperty(value = "用人经理id")
    private String  managerId;
    @ApiModelProperty(value = "面试官id")
    private String  interviewerId;
}
