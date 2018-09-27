package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "更新简历筛选规则的标签状态")
public class ProfileFilterUpdateVO extends BaseVO {

    @ApiModelProperty(value = "1有效，0删除，2关闭")
    private Integer disable;
    @ApiModelProperty(value = "企业筛选规则编号")
    private List<Integer> filterIds;
}
