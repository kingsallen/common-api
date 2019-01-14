package com.moseeker.vo.position.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/11/22.
 */
@Data
@ApiModel("团队对应的职位的数量")
public class PositionTeamCountVO {
    @ApiModelProperty(value = "团队id",required = true)
    private Integer teamId;
    @ApiModelProperty(value = "职位数量",required = true)
    private Integer count;
}
