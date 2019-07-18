package com.moseeker.vo.application.ats;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * HrAtsImportProcessVO
 *
 * @Author: lee
 * @Date: 2019/7/12
 */
@Data
@ApiModel("候选人流程导入结果VO")
public class HrAtsImportProcessResultVO {
    @ApiModelProperty(name = "userId", value = "用户Id", dataType = "int", required = true, example = "82752")
    private Integer userId;
    @ApiModelProperty(name = "userName", value = "姓名", dataType = "string", required = true, example = "张三")
    private String userName;
    @ApiModelProperty(name = "mobile", value = "手机号", dataType = "string", required = true, example = "17854282752")
    private String mobile;
    @ApiModelProperty(name = "email", value = "邮箱", dataType = "string", required = true, example = "example@moseeker.com")
    private String email;
    @ApiModelProperty(name = "positionId", value = "职位ID", dataType = "int", required = true, example = "52635")
    private Integer positionId;
    @ApiModelProperty(name = "processId", value = "阶段标识", dataType = "int", required = true, example = "666")
    private Integer processId;
    @ApiModelProperty(name = "appId", value = "申请id", dataType = "int", required = true, example = "888")
    private Integer appId;
    @ApiModelProperty(name = "result", value = "导入结果", dataType = "string", required = true, example = "成功")
    private String result;
    @ApiModelProperty(name = "result", value = "失败原因", dataType = "string", required = true, example = "阶段标识错误")
    private String errorInfo;
}
