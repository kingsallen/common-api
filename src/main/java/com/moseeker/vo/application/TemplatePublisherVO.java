package com.moseeker.vo.application;/**
 * Created by zztaiwll on 19/1/2.
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @version 1.0
 * @className TemplatePublisherVO
 * @Description TODO
 * @Author zztaiwll
 * @DATE 19/1/2 下午3:34
 **/
@Data
@ApiModel(value = "修改职位的模板的所有这者的数据模型")
public class TemplatePublisherVO {
    @ApiModelProperty(value = "模板id集合",dataType = "java.util.List",required = true,example = "[1,21]")
    private List<Integer> idList;
    @ApiModelProperty(value = "模板发布人的id",dataType = "java.lang.Integer",required = true,example = "82752")
    private Integer hrId;

}
