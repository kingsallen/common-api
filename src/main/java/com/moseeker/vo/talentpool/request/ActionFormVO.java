package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "筛选规则可执行操作")
public class ActionFormVO {

    @ApiModelProperty(value = "0 收藏到人才库 1改变申请状态")
    private Integer type;
    @ApiModelProperty(value = "type=0时7 通过 13不通过 type=1时 0 私密 1代表公开")
    private Integer value;
}
