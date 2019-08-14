package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 */
@Data
@Builder
@ApiModel(description = "消息中心-入职")
public class MessageCenterEntryVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty(name = "applicationId",value = "申请id",required = true)
    private Integer applicationId;
}
