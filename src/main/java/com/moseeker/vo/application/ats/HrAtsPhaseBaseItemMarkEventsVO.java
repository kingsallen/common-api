package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("ats阶段标记事件返回值")
public class HrAtsPhaseBaseItemMarkEventsVO {
    @ApiModelProperty(name="id",value = "阶段编号")
    private Integer id;
    @ApiModelProperty(name="name",value = "阶段名称")
    private String name;
    @ApiModelProperty(name="parentName",value = "父阶段名称")
    private String parentName;
    @ApiModelProperty(name="markEventList",value = "标记事件名称列表")
    private List<String> markEventList;
}
