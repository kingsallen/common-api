package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("ats流程具体的企业配置项返回值")
public class HrAtsProcessBaseItemResponseVO extends  HrAtsProcessBaseItemVO{
    @ApiModelProperty(name="openMessage",value = "是否开启了消息")
    private Integer openMessage;
    @ApiModelProperty(name="parentType",value = "所属的阶段类型")
    private Integer parentType;
}
