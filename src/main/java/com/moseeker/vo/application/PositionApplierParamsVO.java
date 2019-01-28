package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/28.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className PositionApplierparamsVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/28 下午3:08
 **/
@Data
@ApiModel("职位和申请人的参数模型")
public class PositionApplierParamsVO {
    @ApiModelProperty(name="positionIdList",value = "职位编号列表",required = true)
    private List<Integer> positionIdList;
    @ApiModelProperty(name="applierIdList",value = "申请者编号列表",required = true)
    private List<Integer> applierIdList;
}
