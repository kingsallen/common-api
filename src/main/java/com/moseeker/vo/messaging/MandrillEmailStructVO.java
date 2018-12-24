package com.moseeker.vo.messaging;

import lombok.Data;

import java.util.Map;

/**
 * MandrillEmailStructVO
 *
 * @Author: lee
 * @Date: 2018/12/24
 */
@Data
public class MandrillEmailStructVO {

    private String templateName;
    private String toEmail;
    private String toName;
    private Map<String, String> mergeVars;
    private String fromEmail;
    private String fromName;
    private String subject;
}
