package com.moseeker.vo.position;/**
 * Created by zztaiwll on 19/2/14.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className jobPositionStatusVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/14 上午9:24
 **/
@Data
@ApiModel("职位状态的对应数据模型")
public class JobPositionStatusVO {
    @ApiModelProperty(name="positionId",value = "职位id",required = true)
    private int id;
    @ApiModelProperty(name="status",value = "职位状态",required = true)
    private int status;
}
