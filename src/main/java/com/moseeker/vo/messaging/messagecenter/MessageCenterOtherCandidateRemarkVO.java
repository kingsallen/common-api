package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;
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
public class MessageCenterOtherCandidateRemarkVO  implements IMessageCenterBaseVO{

    @ApiModelProperty("操作者id")
    private Integer hrId;

    @ApiModelProperty("申请id")
    private Integer applicationId;

    @ApiModelProperty("评论内容")
    private String remark;

    @Override
    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return MessageCenterNoticeType.OTHER_CANDIDATE_REMARK;
    }
}
