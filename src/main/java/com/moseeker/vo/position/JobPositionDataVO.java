package com.moseeker.vo.position;/**
 * Created by zztaiwll on 18/12/28.
 */

import com.moseeker.vo.position.basic.JobPositionVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className JobPositionDataVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 18/12/28 下午2:40
 **/
@Data
@ApiModel("职位相关的保存和更新使用的数据")
public class JobPositionDataVO extends JobPositionVO{
    @ApiModelProperty(value = "简历过滤配置项编号",example = "[1,2,3,4]",required = false,dataType = "java.util.List")
    private List<Integer> filterIds;
    @ApiModelProperty(value = "邮件配置",example = "[]",required = false,dataType = "java.util.List")
    private List<String> emails;
    @ApiModelProperty(name="",value = "面试流程id ",required = false)
    private Integer interviewProcessId;
}
