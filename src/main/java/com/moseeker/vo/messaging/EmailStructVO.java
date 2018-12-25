package com.moseeker.vo.messaging;

import lombok.Data;

/**
 * EmailStructVO
 *
 * @Author: lee
 * @Date: 2018/12/24
 */
@Data
public class EmailStructVO {
    private Integer userId;
    private String email;
    private String url;
    private Integer eventType;
    private String subject;
}
