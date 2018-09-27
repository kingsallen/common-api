package com.moseeker.vo.talentpool.request;

import com.moseeker.vo.talentpool.basc.TalentpoolCompanyTagVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/27.
 */
@Data
@ApiModel(description = "新增简历筛选规则")
public class ProfileFilterInsertVO  {

    @ApiModelProperty(value = "1有效，0删除，2关闭")
    private TalentpoolCompanyTagVO companyTagVO;
    @ApiModelProperty(value = "企业筛选规则编号")
    private List<ActionFormVO> actionForm;
    @ApiModelProperty(value = "关联到的职位编号")
    private List<Integer> positionIdList;
    private Integer hrId;
    @ApiModelProperty(value = "是否全选")
    private Integer positionTotal;
}
