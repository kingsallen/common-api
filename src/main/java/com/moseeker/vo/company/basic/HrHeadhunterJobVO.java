package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * HrHeadhunterJobVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("猎头职位VO")
public class HrHeadhunterJobVO {

    @ApiModelProperty(value = "主键")
    private Integer id;
    @ApiModelProperty(value = "猎头id")
    private Integer headhunterId;
    @ApiModelProperty(value = "职位id")
    private Integer jobId;
    @ApiModelProperty(name ="status",value = "职位状态 0：正常，1：停止，2：删除",example = "0", dataType="java.lang.Integer")
    private Byte status;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
