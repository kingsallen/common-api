package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("企业招聘流程基础类别表")
@Data
public class HrAtsPhaseBaseVO {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "name",value = "阶段名称")
    private String name;
    @ApiModelProperty(name = "companyId",value = "公司id")
    private Integer companyId;
    @ApiModelProperty(name = "type",value = "类别 1是筛选类 2是面食类型 3是服务类型 4offer类型 5其他类型  0默认类型这种状态是不对的")
    private Integer type;
    @ApiModelProperty(name = "description",value = "描述")
    private String description;
    @ApiModelProperty(name = "createTime",value = "主键id")
    private String createTime;
    @ApiModelProperty(name = "updateTime",value = "主键id")
    private String updateTime;
    @ApiModelProperty(name = "system",value = "是否是默认类型")
    private int system;


}
