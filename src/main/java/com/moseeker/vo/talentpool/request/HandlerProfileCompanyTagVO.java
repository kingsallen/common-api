package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.Set;

/**
 * Created by moseeker on 2018/9/29.
 */
@Data
public class HandlerProfileCompanyTagVO {

    @ApiModelProperty(value = "用户ID数组")
    @ApiParam( name="userIdSet",value = "用户ID数组",defaultValue = "1")
    private Set<Integer> userIdSet;

    @ApiModelProperty(value = "公司编号")
    @ApiParam( name="companyId",value = "公司编号",defaultValue = "4")
    private Integer companyId;
}
