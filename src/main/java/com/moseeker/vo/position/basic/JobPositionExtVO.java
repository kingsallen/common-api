package com.moseeker.vo.position.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("职位相关的中间表的数据模型")
public class JobPositionExtVO {
    @ApiModelProperty(value = "job_custom.id",dataType = "int",required = false,example = "0")
    private Integer jobCustomId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String updateTime;
    @ApiModelProperty(value = "job_occupation.id",dataType = "int",required = false,example = "0")
    private Integer jobOccupationId;
    @ApiModelProperty(value = "job_position.id",dataType = "int",required = false,example = "0")
    private Integer pid;
    @ApiModelProperty(value = "SuccessFactors对接",dataType = "String",required = false,example = "111")
    private String extra;
    @ApiModelProperty(value = "SuccessFactors对接",dataType = "String",required = false,example = "111")
    private String ext;
    
}
