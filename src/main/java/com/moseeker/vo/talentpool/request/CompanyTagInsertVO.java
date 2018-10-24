package com.moseeker.vo.talentpool.request;

import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/29.
 */
@Data
public class CompanyTagInsertVO  {

    private TalentpoolFilterTagVO tagVO;
    @ApiParam(value = "hr编号", required = true,defaultValue = "1")
    private Integer hrId;

}
