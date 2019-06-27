package com.moseeker.vo.company.response;

import com.moseeker.vo.company.basic.HrCompanyVO;
import lombok.Data;

/**
 * Created by zztaiwll on 18/8/28.
 */
@Data
public class CompanyPublisherVO {
    private Integer publisher;
    private HrCompanyVO company;
}
