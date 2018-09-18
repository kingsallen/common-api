package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.HrNpsRecommendVO;
import com.moseeker.vo.company.basic.HrNpsVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrNpsResultVO {
    private HrNpsVO hrNps;
    private HrNpsRecommendVO hrNpsRecommend;


}
