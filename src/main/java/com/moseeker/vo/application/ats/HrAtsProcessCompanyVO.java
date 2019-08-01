package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ats流程的信息")
public class HrAtsProcessCompanyVO {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "name",value = "流程名称")
    private String name;
    @ApiModelProperty(name = "companyId",value = "所属公司 hrdb.hr_company.id")
    private Integer companyId;
    @ApiModelProperty(name = "disable",value = "是否有效 0有效 1无效")
    private Integer disable;
    @ApiModelProperty(name = "description",value = "描述")
    private String description;
    @ApiModelProperty(name = "createTime",value = "创建时间")
    private String createTime;
    @ApiModelProperty(name = "updateTime",value = "更新时间")
    private String updateTime;

}
