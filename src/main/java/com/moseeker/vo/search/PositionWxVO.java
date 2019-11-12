package com.moseeker.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Map;

/**
 * PositionWxVO
 *
 * @Author: lee
 * @Date: 2019/11/12
 */
@Data
@ApiModel("微信端职位查询VO")
public class PositionWxVO {

    @ApiModelProperty(value = "查询条数", required = true, dataType = "int")
    private Integer querySize;
    @ApiModelProperty(value = "公司id", required = true, dataType = "int")
    private Integer companyId;
    private boolean isReferral;
    private Map<String, Object> searchCondition;
    private Integer salaryTop;
    private Integer salaryBottom;
}
