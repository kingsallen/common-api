package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/2/14.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className JobPositionAppVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/14 上午9:45
 **/
@Data
@ApiModel("申请和职位的关系数据模型")
public class JobPositionAppVO {
    @ApiModelProperty(name="id",value = "申请id",required = true)
    private int id;
    @ApiModelProperty(name="positionId",value = "职位id",required = true)
    private int positionId;
    @ApiModelProperty(name="applierId",value = "申请者id",required = true)
    private int applierId;
}
