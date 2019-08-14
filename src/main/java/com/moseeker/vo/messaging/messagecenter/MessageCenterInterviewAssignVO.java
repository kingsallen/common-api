package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@ApiModel(description = "消息中心-面试-安排面试")
public class MessageCenterInterviewAssignVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "hrInterviewConcreteId",value = "面试安排id",required = true)
    private Integer hrInterviewConcreteId;
}
