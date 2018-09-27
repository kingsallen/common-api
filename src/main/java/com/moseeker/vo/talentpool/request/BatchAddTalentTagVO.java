package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "hr标签")
public class BatchAddTalentTagVO extends BaseVO {

    @ApiModelProperty(value = "用户的编号的集合")
    private Set<Integer> userIdList;
    @ApiModelProperty(value = "标签的编号集合")
    private Set<Integer> tagIdList;

}
