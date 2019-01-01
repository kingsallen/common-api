package com.moseeker.vo.position;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zztaiwll on 18/11/27.
 */
@Data
@ApiModel(value = "删除账号后职位换绑的传参数据模型")
public class PositionPublisherModifyVO {
   @ApiModelProperty(value = "主账号id",required = true)
   private int superId;
   @ApiModelProperty(value = "子账号id",required = true)
   private int id;
}
