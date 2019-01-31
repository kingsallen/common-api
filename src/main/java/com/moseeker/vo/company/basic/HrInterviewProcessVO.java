package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Date: 2019/1/28
 * @Author: JackYang
 */
@ApiModel(value = "HrInterviewProcessVO")
@Data
public class HrInterviewProcessVO {
    @ApiModelProperty(value = "序列ID")
    private Integer  id;
    @ApiModelProperty(value = "公司ID")
    private Integer   companyId ;
    @ApiModelProperty(value = "HR ID")
    private Integer hrId;
    @ApiModelProperty(value = "面试流程名称")
    private String processName;
    @ApiModelProperty(value = "状态 0 有效 1无效")
    private Integer disabled =0;
    @ApiModelProperty(value = "逻辑删除 0 未删除 1已删除")
    private Integer deleted =0;
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-11-28 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-11-28 16:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;

}
