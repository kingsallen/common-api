package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ats流程企业端配置项")
public class HrAtsProcessCompanyItemVO {
    @ApiModelProperty(name = "id",value = "主键id")
    private Integer id;
    @ApiModelProperty(name = "itemOrder",value = "排序，由小到大")
    private Integer itemOrder;
    @ApiModelProperty(name = "parentId",value = "ats流程企业端配置项")
    private Integer parentId;
    @ApiModelProperty(name = "itemId",value = "ats流程具体的企业配置项")
    private Integer itemId;
    @ApiModelProperty(name = "createTime",value = "创建时间")
    private String createTime;
    @ApiModelProperty(name = "updateTime",value = "更新时间")
    private String updateTime;
}
