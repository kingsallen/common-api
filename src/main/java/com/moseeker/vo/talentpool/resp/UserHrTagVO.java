package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.basc.TalentpoolUserTagVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/20.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(description = "hr下面候选人的标签")
public class UserHrTagVO extends TalentpoolUserTagVO {

    @ApiModelProperty(value = "标签名称")
    private String    name;
    @ApiModelProperty(value = "企业标签颜色")
    private String    color;


}
