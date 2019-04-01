package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/28.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className AppStatusCountVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/28 下午2:14
 **/
@Data
@ApiModel("申请状态的数量的模型")
public class AppStatusCountVO {
    @ApiModelProperty(name = "name",value = "状态名称",required = true)
    private String name;
    @ApiModelProperty(name = "total",value = "数量",required = true)
    private int total;

}
