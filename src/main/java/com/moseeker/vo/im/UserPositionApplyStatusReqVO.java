package com.moseeker.vo.im;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 在聊天记录中，标记用户已经投递该职位。
 * @autho 王耀峰
 *
 */
@ApiModel(value = "更新聊天记录中的s申请状态")
@Data
public class UserPositionApplyStatusReqVO {

	@ApiModelProperty(value = "用户id")
	private int userId;
	@ApiModelProperty(value = "职位id")
	private int positionId;


}
