package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("标志事件信息")
public class HrAtsProcessMarkEventItemsInfoVO extends HrAtsProcessEventItemsVO {
    @ApiModelProperty(name="selected",value = "是否开启")
    private Integer selected;
}
