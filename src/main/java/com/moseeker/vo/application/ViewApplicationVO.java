package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/8.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className ViewApplicationVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/8 下午5:12
 **/
@Data
@ApiModel("hr查看简历的数据模型")
public class ViewApplicationVO {
    @ApiModelProperty(value = "hr编号",name="hrId",dataType = "java.lang.int",required = true,example = "82752")
    private int hrId;
    @ApiModelProperty(value = "申请编号",name="applicationIds",dataType = "java.util.List",required = true,example = "[1,3,4]")
    private List<Integer> applicationIds;
}
