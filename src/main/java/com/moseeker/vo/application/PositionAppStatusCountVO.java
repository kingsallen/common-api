package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/28.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className PositionAppStatusCountVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/28 下午2:17
 **/
@Data
@ApiModel("职位申请状态数量的数据模型")
public class PositionAppStatusCountVO {
    @ApiModelProperty(name="positionId",value = "职位编号",required = true)
    private int positionId;
    @ApiModelProperty(name="count",value = "状态的数量集合",required = true)
    private List<AppStatusCountVO> count;
}
