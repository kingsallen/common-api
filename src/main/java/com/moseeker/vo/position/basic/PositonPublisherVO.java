package com.moseeker.vo.position.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("职位id和发布人的数据模型")
public class PositonPublisherVO {
    @ApiModelProperty(value = "职位的id列表",required = true,dataType = "java.util.List",example = "[1,2,3,4]")
    private List<Integer> pidList;
    @ApiModelProperty(value = "职位的发布人",required = true,dataType = "java.lang.util",example = "82752")
    private Integer publisher;
}
