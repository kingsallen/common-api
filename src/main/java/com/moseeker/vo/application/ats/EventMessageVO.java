package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("事件模板表")
public class EventMessageVO {
    @ApiModelProperty(name="eventId",value ="事件id" )
    private int eventId;
    @ApiModelProperty(name="messageId",value ="模板id" )
    private int messageId;
}
