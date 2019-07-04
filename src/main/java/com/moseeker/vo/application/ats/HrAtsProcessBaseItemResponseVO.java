package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("ats流程具体的企业配置项返回值")
public class HrAtsProcessBaseItemResponseVO extends  HrAtsProcessBaseItemVO{
    private Integer openMessage;
}
