package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/9/13.
 */
@Data
@ApiModel(value = "职位的简略信息")
public class JobPositionSimpleDataVO {
    @ApiModelProperty(value = "职位状态",required = false)
    private int status;
    @ApiModelProperty(value = "职位标题",required = false)
    private String title;
}
