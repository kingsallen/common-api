package com.moseeker.vo.messaging.messagecenter;

import com.moseeker.constant.messaging.MessageCenterNoticeType;

/**
 *   消息中心 mark class
 */
public abstract class AbstractMessageCenterBaseVO {
    protected MessageCenterNoticeType messageCenterNoticeType;

    public MessageCenterNoticeType getMessageCenterNoticeType() {
        return messageCenterNoticeType;
    }

    public void setMessageCenterNoticeType(MessageCenterNoticeType messageCenterNoticeType) {
        this.messageCenterNoticeType = messageCenterNoticeType;
    }
}
