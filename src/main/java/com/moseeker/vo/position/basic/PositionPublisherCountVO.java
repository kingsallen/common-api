package com.moseeker.vo.position.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/11/22.
 */
@Data
@ApiModel("职位发布人的职位数量")
public class PositionPublisherCountVO {
    @ApiModelProperty(value = "职位发布人",required = true)
    private Integer publisher;
    @ApiModelProperty(value = "职位数量",required = true)
    private Integer count;
}
