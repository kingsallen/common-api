package com.moseeker.vo.position;/**
 * Created by zztaiwll on 19/1/31.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0
 * @className InterviewPositionCountVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/31 下午2:19
 **/
@Data
@ApiModel("面试流程关联职位的数量")
public class InterviewPositionCountVO {
    @ApiModelProperty(name="pid",value="面试编号",required = true)
    private int interviewId;
    @ApiModelProperty(name="total",value="总数",required = true)
    private int total;
}
