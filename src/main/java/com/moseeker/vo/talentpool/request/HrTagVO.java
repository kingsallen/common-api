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
@ApiModel(description = "hr标签增加对象")
public class HrTagVO extends BaseVO {

    @ApiModelProperty(value = "标签名称，新增、修改时必填")
    private String name;

    @ApiModelProperty(value = "标签编号，删除、修改时必填")
    private Integer tagId;
}
