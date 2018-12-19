package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Date: 2018/12/14
 * @Author: JackYang
 */
@Data
@ApiModel("职位筛选配置的数据模型")
public class JobPositionProfileFilterVO {
    @ApiModelProperty(value = "job_position.id",required = true,dataType = "int",example = "1")
    private Integer pid;
    @ApiModelProperty(value = "talentpool_profile_filter.id",required = true,dataType = "int",example = "1")
    private Integer pfid;
}
