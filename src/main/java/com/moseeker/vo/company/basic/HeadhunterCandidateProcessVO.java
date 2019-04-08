package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * HeadhunterCandidateProcessVO
 *
 * @Author: lee
 * @Date: 2019/4/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("猎头候选人状态vo")
public class HeadhunterCandidateProcessVO {

    @ApiModelProperty(name = "count", value = "候选人数量")
    private Integer count;
    @ApiModelProperty(name = "name" ,value = "状态名称")
    private String name;
    @ApiModelProperty(name = "status", value = "状态标识")
    private Integer status;


}
