package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HrHeadhunterPostionVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("职位数据VO")
public class HrHeadhunterPostionVO {

    @ApiModelProperty(value = "职位名称")
    private String positionName;
    @ApiModelProperty(value = "地区")
    private String cityName;
    @ApiModelProperty(value = "部门")
    private String departmentName;
    @ApiModelProperty(value = "发布人")
    private String hrName;
    @ApiModelProperty(value = "候选人数")
    private String candidateCount;

}
