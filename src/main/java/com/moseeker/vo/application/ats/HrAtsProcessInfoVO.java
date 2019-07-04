package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("流程的详细信息")
public class HrAtsProcessInfoVO {
    @ApiModelProperty(name="main",value = "主要信息")
    private  HrAtsProcessCompanyVO main;
    @ApiModelProperty(name="dataList",value = "配置项信息")
    private List<HrAtsProcessCompanyItemInfoVO> dataList;
}
