package com.moseeker.vo.position;

import com.moseeker.vo.company.basic.UserHrAccountVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class PositionResponsibleUser {
    @ApiModelProperty(value = "招聘负责人", dataType = "java.util.List")
    private List<UserHrAccountVO> publisher;
    @ApiModelProperty(value = "招聘协调人", dataType = "java.util.List")
    private List<UserHrAccountVO> coordinator;
    @ApiModelProperty(value = "用人经理", dataType = "java.util.List")
    private List<UserHrAccountVO> manager;
    @ApiModelProperty(value = "面试官", dataType = "java.util.List")
    private List<UserHrAccountVO> interviewer;
}
