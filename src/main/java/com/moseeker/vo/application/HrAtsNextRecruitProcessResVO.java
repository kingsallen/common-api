package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("下一状态的信息")
public class HrAtsNextRecruitProcessResVO {
    @ApiModelProperty(name="nowProcessId",value = "当前状态")
    private int nowProcessId;
    @ApiModelProperty(name="nowParentId",value = "当前状态的父状态")
    private int nowParentId;
    @ApiModelProperty(name="nextProcessId",value = "下一个状态的状态")
    private int nextProcessId;
    @ApiModelProperty(name="nextParentId",value = "下一个状态的父状态")
    private int nextParentId;
    @ApiModelProperty(name="isFlag",value = "是否跨大阶段 0否1是")
    private int isFlag;

}
