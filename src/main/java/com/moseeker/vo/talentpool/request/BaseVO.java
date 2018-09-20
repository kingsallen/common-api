package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/18.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "hr标签")
public class BaseVO {

    @ApiModelProperty(value = "hr编号", required = true)
    private Integer hrId;
    @ApiModelProperty(value = "公司编号", required = true)
    private Integer companyId;
}
