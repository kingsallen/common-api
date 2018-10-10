package com.moseeker.vo.talentpool.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "满足企业筛选规则数据")
public class FilterProfileVo {

    @ApiModelProperty(value = "满足筛选规则的简历数量")
    private Integer num;
    @ApiModelProperty(value = "邮件额度是否满足发送")
    private boolean enable;
    @ApiModelProperty(value = "上一次发送时间")
    private String lastSendTime;
    @ApiModelProperty(value = "是否存在初审通过的筛选规则")
    private boolean isFilter = false;

}
