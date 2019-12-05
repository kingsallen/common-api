package com.moseeker.vo.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * PositionWxVO
 *
 * @Author: lee
 * @Date: 2019/11/12
 */
@Data
@ApiModel("微信端职位查询VO")
public class PositionWxVO {

    @ApiModelProperty(value = "公司id", required = true, dataType = "int")
    private Integer companyId;
    @ApiModelProperty(value = "是否内推", required = true, dataType = "int")
    private boolean isReferral;

    @ApiModelProperty(value = "展示语言", required = true, dataType = "string", example = "en_US")
    private String displayLocale;
    @ApiModelProperty(value = "公司数据库配置项", required = true, dataType = "java.util.List")
    private List<Integer> confSearchSeq;
    @ApiModelProperty(value = "链接参数", required = true, dataType = "java.util.Map", example = "{\"did\":39978,\"degree\":2}")
    private Map<String, String> params;
}
