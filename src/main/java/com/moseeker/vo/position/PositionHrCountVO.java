package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/9/4.
 */
@Data
@ApiModel("职位发布人与发布职位数量的数据模型")
public class PositionHrCountVO {
    @ApiModelProperty(value = "hr编号",required = true,dataType = "java.lang.Integer",example = "82752")
    private Integer hrId;
    @ApiModelProperty(value = "职位数量",required = true,dataType = "java.lang.Integer",example = "100")
    private Integer count;
}
