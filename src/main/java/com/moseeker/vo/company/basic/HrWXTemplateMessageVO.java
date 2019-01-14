package com.moseeker.vo.company.basic;

import lombok.Data;

@Data
public class HrWXTemplateMessageVO {

    private int id;
    private int sysTemplateId;
    private String wxTemplateId;
    private int display;
    private int priority;
    private int wechatId;
    private int disable;
    private String url;
    private String topcolor;
    private String first;
    private String remark;
    
}
