package com.moseeker.vo.company.response;/**
 * Created by zztaiwll on 19/2/25.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className ApplicationStatusVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/2/25 下午4:07
 **/
@Data
@ApiModel("招聘状态的数据模型")
public class ApplicationStatusVO {
    @ApiModelProperty(name="name",value = "名称",required = true)
    private String name;
    @ApiModelProperty(name="order",value = "顺序编号",required = true)
    private int order;
    @ApiModelProperty(name="processId",value = "进度id",required = true)
    private int processId;
    @ApiModelProperty(name="dataList",value = "小招聘流程",required = true)
    private List<ApplicationStatusDataVO> dataList;

}
