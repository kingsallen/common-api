package com.moseeker.vo.messaging.messagecenter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yehu
 * date 2019-08-13 16:26
 */
@Data
@ApiModel(description = "@提醒-@我的")
public class MessageCenterOtherChatWithMeVO implements IMessageCenterBaseVO, Serializable {

    @ApiModelProperty("操作者id")
    private Integer hrId;

    @ApiModelProperty("被@的人的id")
    private Integer recieverId;

    @ApiModelProperty("申请id")
    private Integer applicationId;

    @ApiModelProperty("@我的内容")
    private String remark;
}
