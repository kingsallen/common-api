package com.moseeker.vo.talentpool.bean;

import com.moseeker.vo.talentpool.basc.TalentpoolCompanyTagVO;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/25.
 */
@Data
public class SearchCompanyTagUserCountVO extends TalentpoolCompanyTagVO {

    private Integer size;
    private Integer from;
    private Integer userId;
}
