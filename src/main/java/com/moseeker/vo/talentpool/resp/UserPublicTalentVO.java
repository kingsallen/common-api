package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.company.basic.UserHrAccountVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Set;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "候选人的公开和收藏的HR")
public class UserPublicTalentVO {

    @ApiModelProperty(value = "候选人编号")
    private Integer userId;
    @ApiModelProperty(value = "收藏的HR列表")
    private Set<UserHrAccountVO> favoriteHrs;
    @ApiModelProperty(value = "公开的HR列表")
    private Set<UserHrAccountVO> publicHrs;
}
