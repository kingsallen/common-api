package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/3.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className PositionApplicationVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/3 下午6:13
 **/
@Data
@ApiModel("职位下的申请数量")
public class PositionApplicationVO {
    @ApiModelProperty(value = "职位编号",dataType = "java.lang.int",required = true)
    private int positionId;
    @ApiModelProperty(value = "申请数量",dataType = "java.lang.int",required = true)
    private int total;
}
