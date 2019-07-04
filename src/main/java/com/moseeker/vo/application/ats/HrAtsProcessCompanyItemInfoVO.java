package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("流程配置项西欧明星哦")
public class HrAtsProcessCompanyItemInfoVO extends HrAtsProcessCompanyItemVO{
    @ApiModelProperty(name="baseItemData",value = "配置型信息")
    private HrAtsProcessBaseItemInfoVO baseItemData;
    @ApiModelProperty(name="appNum",value = "申请数量")
    private int appNum;
}
