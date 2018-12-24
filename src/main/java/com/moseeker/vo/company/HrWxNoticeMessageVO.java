package com.moseeker.vo.company;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HrWxNoticeMessageVO
 *
 * @Author: lee
 * @Date: 2018/12/24
 */
@Data
public class HrWxNoticeMessageVO {
    private Integer id;
    private Integer wechatId;
    private Integer noticeId;
    private String first;
    private String remark;
    @ApiModelProperty(dataType = "java.lang.Integer")
    private Byte status;
    @ApiModelProperty(dataType = "java.lang.Integer")
    private Byte disable;
}
