package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
@ApiModel("流程配置项的请求参数")
public class HrAtsPhaseBaseItemRequestVO extends HrAtsPhaseBaseItemVO {
    @ApiModelProperty(name="openList",value = "标志功能开启的列表")
    private List<Integer>  openList;
    @ApiModelProperty(name="eventList",value = "事件功能列表")
    private List<EventMessageVO> eventList;
    @ApiModelProperty(name="hrId",value = "hr编号")
    private Integer hrId;


}
