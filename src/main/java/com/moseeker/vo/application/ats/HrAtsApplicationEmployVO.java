package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

/**
 * HrAtsApplicationEmployVO
 *
 * @Author: lee
 * @Date: 2019/9/10
 */
@Data
public class HrAtsApplicationEmployVO {

    @ApiModelProperty(name = "id", value = "主键", dataType = "int", example = "10")
    private Integer   id;
    @ApiModelProperty(name = "applicationId", value = "申请Id", dataType = "int", example = "651")
    private Integer   applicationId;
    @ApiModelProperty(name = "hrId", value = "hrId", dataType = "int", example = "15")
    private Integer   hrId;
    @ApiModelProperty(name = "expectEmployDate", value = "预计入职日期")
    private Date expectEmployDate;
    @ApiModelProperty(name = "employDate", value = "入职日期")
    private Date      employDate;
    @ApiModelProperty(name = "employStatus", value = "入职状态：0 待入职，1 已入职，2 放弃入职", example = "0")
    private Integer   employStatus;
    @ApiModelProperty(name = "reason", value = "放弃入职原因")
    private String    reason;
    @ApiModelProperty(name = "disable", value = "是否可用： 0有效 1无效 2逻辑删除", example = "0")
    private Integer   disable;
}
