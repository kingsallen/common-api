package com.moseeker.vo.position.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/11/22.
 */
@ApiModel("职位发布人的团队数量")
@Data
public class PositionTeamPublisherCountVO {
    @ApiModelProperty(value = "职位发布人",required = true)
    private Integer publisher;
    @ApiModelProperty(value = "团队数量",required = true)
    private Integer count;
}
