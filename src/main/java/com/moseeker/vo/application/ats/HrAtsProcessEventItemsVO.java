package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("招聘管理事件")
@Data
public class HrAtsProcessEventItemsVO {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "name",value = "事件名称")
    private  String name;
    @ApiModelProperty(name = "type",value = "事件类型")
    private Integer type;
    @ApiModelProperty(name = "eventType",value = "执行的事件类型 0是可执行事件 1是挂载标识功能事件")
    private Integer eventType;
    @ApiModelProperty(name = "executeType",value = "事件执行属性 0进入时执行 1离开时执行")
    private Integer executeType;
    @ApiModelProperty(name = "description",value = "事件描述")
    private String description;
    @ApiModelProperty(name = "disable",value = "是否有效 0有效1无效")
    private  Integer  disable;
    @ApiModelProperty(name = "createTime",value = "主键id")
    private String createTime;
    @ApiModelProperty(name = "updateTime",value = "主键id")
    private String updateTime;
}
