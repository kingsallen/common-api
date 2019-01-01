package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/9/11.
 */
@Data
@ApiModel(value = "hr获得的申请的数量")
public class PublisherApplicationCountVO {
    @ApiModelProperty(value = "发布职位的hr编号",required = false)
    private int publisher;
    @ApiModelProperty(value = "投递总数",required = false)
    private int total;
}