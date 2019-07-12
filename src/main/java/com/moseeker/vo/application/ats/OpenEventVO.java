package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("标记事件表")
public class OpenEventVO {
    @ApiModelProperty(name="eventId",value ="事件id" )
    private int eventId;
    @ApiModelProperty(name="eventOrder",value ="事件顺序" )
    private int eventOrder;
}
