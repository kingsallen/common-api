package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/3.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className PositionApplierIdVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/3 上午9:09
 **/
@Data
@ApiModel("职位和申请人的参数列表")
public class PositionApplierIdVO {
    @ApiModelProperty(value = "申请人的列表",name = "appLierIdList" ,dataType = "java.util.List",required = true,example = "[1,2,3,4]")
    private List<Integer> appLierIdList;
    @ApiModelProperty(value = "职位的列表",name = "positionIdList",dataType = "java.util.List",required = true,example = "[1,2,3,4]")
    private List<Integer> positionIdList;
}
