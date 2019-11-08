package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("申请回传状态统计")
public class ApplicationAtsStatusStatVO {

    @ApiModelProperty("公司id")
    private Integer companyId;

    @ApiModelProperty("公司名称")
    private String companyName;

    @ApiModelProperty("申请状态")
    private Integer atsStatus;

    @ApiModelProperty("状态下申请数量")
    private Integer count;
}
