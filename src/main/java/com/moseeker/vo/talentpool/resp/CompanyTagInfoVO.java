package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.request.TalentpoolFilterTagVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/29.
 */
@Data
@ApiModel(description = "企业标签信息")
public class CompanyTagInfoVO {

    @ApiModelProperty(value = "企业标签信息")
    private TalentpoolFilterTagVO companyTag;
    @ApiModelProperty(value = "企业标签是否正在执行")
    private boolean isExecute;
    @ApiModelProperty(value = "企业标签预估执行时间/h")
    private Integer expireTime;
    @ApiModelProperty(value = "有多少人被打上这个标签")
    private Integer personNum;

}
