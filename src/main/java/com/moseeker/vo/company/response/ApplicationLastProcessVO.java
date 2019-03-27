package com.moseeker.vo.company.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("上一个状态的数据模型")
public class ApplicationLastProcessVO {
    @ApiModelProperty(name="appId",value = "申请id",required = true)
    private int appId;
    @ApiModelProperty(name="lastProcessId",value = "上一个状态",required = true)
    private int lastProcessId;
}
