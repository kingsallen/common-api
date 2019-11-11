package com.moseeker.vo.application;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * HrATsBatchProcessResVO
 *
 * @Author: lee
 * @Date: 2019/7/17
 */
@Data
@ApiModel("批量更新招聘修改返回结果")
public class HrATsBatchProcessResVO {
    @ApiModelProperty(name="successData",value = "执行成功的申请进度变化列表",dataType = "java.util")
    private List<Integer> successData;
    @ApiModelProperty(name="errorDataList",value = "执行失败的申请进度变化列表",dataType = "java.util")
    private List<Map<String, Object>> errorDataList;
}
