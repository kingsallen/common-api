package com.moseeker.vo.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SyncPositionVO {
    @ApiModelProperty(value = "职位id")
    private Integer pid;
    @ApiModelProperty(value = "职位title")
    private String title;

}
