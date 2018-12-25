package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by zztaiwll on 18/6/11.
 */
@ApiModel("职位信息扩展表")
@Data
public class JobPositionOtherVO {
    @ApiModelProperty(value = "有jd页",required = false)
    private Integer newJdStatus;
    @ApiModelProperty(value = "是否全国 0是否 1是",required = false)
    private Integer cityFlag;

}
