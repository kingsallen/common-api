package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterDataFormVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("猎头数据参数VO")
public class HeadhunterDataFormVO {

    @ApiModelProperty(value = "猎头账号Id")
    private Integer headhunterId;
    @ApiModelProperty(value = "职位名称")
    private String positionName;
    @ApiModelProperty(value = "发布人")
    private Integer hrId;
    @ApiModelProperty(value = "每页条数")
    private Integer pageSize;
    @ApiModelProperty(value = "当前页码")
    private Integer pageNum;
}