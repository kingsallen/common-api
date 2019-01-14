package com.moseeker.vo.position.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
@ApiModel("自定义职位职能的数据模型")
public class JobOccupationVO {
    private Integer   id;
    @ApiModelProperty(value = "公司编号",required = true,example = "39978",dataType = "java.lang.Integer")
    private Integer   companyId;
    @ApiModelProperty(value = "职能状态",required = true,example = "0",dataType = "java.lang.Integer")
    private Byte      status;
    @ApiModelProperty(value = "职能名称",required = true,example = "0",dataType = "java.lang.Integer")
    private String    name;
    @ApiModelProperty(value = "职能类型",required = true,example = "0",dataType = "java.lang.Integer")
    private Byte      type;
    @ApiModelProperty(value = "创建时间",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间",required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
    
}
