package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/2/22.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className ApplicationProcessVo
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/22 下午4:22
 **/
@Data
@ApiModel("招聘进度修改的请求参数的数据模型")
public class ApplicationProcessVO {
    @ApiModelProperty(name="companyId",value = "公司编号",required = true)
    private Integer companyId;
    @ApiModelProperty(name="hrId",value = "hr编号",required = true)
    private Integer hrId;
    @ApiModelProperty(name="nowProcessId",value = "当前状态",required = true)
    private Integer nowProcessId;
    @ApiModelProperty(name="nextProcessId",value = "跳转到的状态",required = true)
    private Integer nextProcessId;
    @ApiModelProperty(name="applicationIdList",value = "申请id列表",required = true,dataType="java.util.List")
    private List<Integer> applicationIdList;

}
