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
@ApiModel(description = "消息中心-其他-候选人备注")
public class MessageCenterOtherCandidateRemarkVO  implements IMessageCenterBaseVO,Serializable {

    @ApiModelProperty("操作者id")
    private Integer hrId;

    @ApiModelProperty("申请id")
    private Integer applicationId;

    @ApiModelProperty("评论内容")
    private String remark;
}
