package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "消息中心-入职")
public class MessageCenterEntryVO {

    @ApiModelProperty(name = "applicationId",value = "申请id",required = true)
    private Integer applicationId;
}
