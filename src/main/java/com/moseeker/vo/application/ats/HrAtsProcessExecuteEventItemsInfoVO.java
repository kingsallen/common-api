package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("标志事件信息")
public class HrAtsProcessExecuteEventItemsInfoVO extends HrAtsProcessEventItemsVO {
    @ApiModelProperty(name="messageId",value="模板id")
    private Integer  messageId;
    @ApiModelProperty(name="name",value="模板名称")
    private String name;
    @ApiModelProperty(name="messageStatus",value="模板状态 0是有效 1是删除")
    private Integer messageStatus;
}
