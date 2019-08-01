package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ats流程具体的企业配置项")
public class HrAtsPhaseBaseItemVO {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "name",value = "阶段名称")
    private String name;
    @ApiModelProperty(name = "parentId",value ="流程类别基础表(hr_ats_process_base.id)")
    private Integer parentId;
    @ApiModelProperty(name = "companyId",value = "公司id hrdb.hr_company.id")
    private Integer companyId;
    @ApiModelProperty(name = "disable",value = "是否启用该项 0启用 1禁用")
    private Integer disable;
    @ApiModelProperty(name = "markWord",value = "标识符")
    private String markWord;
    @ApiModelProperty(name = "showName",value = "对外展示名称")
    private String showName;
    @ApiModelProperty(name = "type",value = "0 系统默认 1自己的配置")
    private Integer type;
    @ApiModelProperty(name = "createTime",value = "创建时间")
    private String createTime;
    @ApiModelProperty(name = "updateTime",value = "更新时间")
    private String updateTime;
}
