package com.moseeker.vo.application;/**
 * Created by zztaiwll on 18/12/11.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className ProfileProcessVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/11 下午3:29
 **/
@Data
@ApiModel(value = "招聘进度的请求数据模型")
public class ProfileProcessVO {
    @ApiModelProperty(value = "hr编号",required = true,dataType = "int")
    private int hrAccountId;
    @ApiModelProperty(value = "job_application.id逗号隔开",required = true,dataType = "String")
    private String appIds;
    @ApiModelProperty(value = "需要设置的状态",required = true,dataType = "int")
    private int status;
    @ApiModelProperty(value = "公司编号",required = true,dataType = "int")
    private int companyId;
}
