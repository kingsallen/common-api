package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "hr申请人才库记录")
public class AppliationInsertVO extends BaseVO{

    @ApiModelProperty(value = "0开启普通人才库，1开启高端人才库")
    private Integer type;
}
