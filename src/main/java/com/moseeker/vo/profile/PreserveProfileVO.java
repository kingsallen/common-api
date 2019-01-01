package com.moseeker.vo.profile;

import lombok.Data;

/**
 * PreserveProfileVO
 *
 * @Author: lee
 * @Date: 2018/12/28
 */
@Data
public class PreserveProfileVO {
    private String params;
    private String fileName;
    private Integer hrId;
    private Integer companyId;
    private Integer userId;
    private Integer source;
}
