package com.moseeker.vo.messaging;

import lombok.Data;

import java.util.Map;

/**
 * MessageTemplateNoticeVO
 *
 * @Author: lee
 * @Date: 2018/12/24
 */
@Data
public class MessageTemplateNoticeVO {
    public int userId;
    public byte type;
    public int sysTemplateId;
    public String url;
    public int companyId;
    public Map<String, MessageTplDataCol> data;
    public byte enableQxRetry;
    public long delay;
    public String validators;
    public String id;
    public String validatorsParams;
    public int wxId;
}
