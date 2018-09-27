package com.moseeker.vo.talentpool.resp;

import lombok.Data;

/**
 * Created by moseeker on 2018/9/21.
 */
@Data
public class CancelTalentVO {

    private CancelTalentHrVO use;
    private CancelTalentApplierVO nooperator;
    private CancelTalentUnHrVO nopower;
}
