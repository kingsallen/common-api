package com.moseeker.vo.position;

import com.moseeker.vo.company.response.HrAccountWithCompanyVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class PositionResponsibleUser {
    @ApiModelProperty(value = "招聘负责人", dataType = "java.util.List")
    private List<HrAccountWithCompanyVO> publisher;
    @ApiModelProperty(value = "招聘协调人", dataType = "java.util.List")
    private List<HrAccountWithCompanyVO> coordinator;
    @ApiModelProperty(value = "用人经理", dataType = "java.util.List")
    private List<HrAccountWithCompanyVO> manager;
    @ApiModelProperty(value = "面试官", dataType = "java.util.List")
    private List<HrAccountWithCompanyVO> interviewer;
}
