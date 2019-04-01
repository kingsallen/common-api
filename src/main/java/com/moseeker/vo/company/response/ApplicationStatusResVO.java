package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/2/26.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className ApplicationStatusResVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/26 上午11:05
 **/
@Data
@ApiModel("申请状态的返回值")
public class ApplicationStatusResVO {
    @ApiModelProperty(name="common",value = "通用的状态参数",required = true)
    private List<ApplicationStatusVO> common;
    @ApiModelProperty(name="eliminate",value = "淘汰的参数",required = true)
    private ApplicationStatusVO eliminate;

}
