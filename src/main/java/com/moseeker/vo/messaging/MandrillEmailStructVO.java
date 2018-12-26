package com.moseeker.vo.messaging;

import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "模板名称", example = "oms - notification")
    private String templateName;
    @ApiModelProperty(value = "收件人邮箱", example = "xxx@moseeker.com")
    private String toEmail;
    @ApiModelProperty(value = "收件人姓名", example = "李XX")
    private String toName;
    @ApiModelProperty(value = "模板变量", dataType = "java.util.Map", example = "{\"name\":\"张三\",\"position_title\":\"java engineer\",\"send_time\":\"2016-11-28\"}")
    private Map<String, String> mergeVars;
    @ApiModelProperty(value = "发件人邮箱", example = "yyy@moseeker.com")
    private String fromEmail;
    @ApiModelProperty(value = "发件人姓名", example = "张XX")
    private String fromName;
    @ApiModelProperty(value = "邮件主题", example = "会议纪要")
    private String subject;
}
