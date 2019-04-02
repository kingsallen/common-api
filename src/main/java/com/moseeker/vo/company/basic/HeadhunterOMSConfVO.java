package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HeadhunterOMSConfVO
 *
 * @Author: lee
 * @Date: 2019/4/2
 */
@Data
@ApiModel("猎头OMS配置信息")
public class HeadhunterOMSConfVO {
    @ApiModelProperty(name = "companyId", value = "公司id")
    private Integer companyId;
    @ApiModelProperty(name = "channelStatus", value = "渠道开关，true ：开通， false：关闭", dataType = "boolean")
    private Boolean channelStatus;
    @ApiModelProperty(name = "loginUrl", value = "猎头登录url")
    private String loginUrl;
    @ApiModelProperty(name = "channelCount", value = "猎头渠道数量")
    private Integer channelCount;
}
