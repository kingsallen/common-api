package com.moseeker.vo.application;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * JobApplicationAtsVO
 *
 * @Author: lee
 * @Date: 2018/12/6
 */
@ApiModel("MoSeeker与ATS渠道申请编号对应关系")
@Data
public class JobApplicationAtsVO implements Serializable {
    private static final long serialVersionUID = 3534856074334808194L;

    private Integer appId;
    private Integer companyId;
    private String atsAppId;
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-11-16 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
