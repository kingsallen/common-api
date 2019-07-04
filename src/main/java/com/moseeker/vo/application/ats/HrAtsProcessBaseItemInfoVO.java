package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
@ApiModel("招聘阶段具体信息")
public class HrAtsProcessBaseItemInfoVO {
    @ApiModelProperty(name="base",value = "基本阶段信息")
    private HrAtsProcessBaseVO base;
    @ApiModelProperty(name="basic",value = "阶段配置基本信息")
    private HrAtsProcessBaseItemVO basic;
    @ApiModelProperty(name="executeEventList",value = "执行事件列表")
    private List<HrAtsProcessExecuteEventItemsInfoVO> executeEventList;
    @ApiModelProperty(name="markEventList",value = "标志事件列表")
    private List<HrAtsProcessMarkEventItemsInfoVO> markEventList;
}
