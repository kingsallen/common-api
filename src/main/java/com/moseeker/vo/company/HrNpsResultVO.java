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

    public HrNpsVO getHrNps() {
        return hrNps;
    }

    public void setHrNps(HrNpsVO hrNps) {
        this.hrNps = hrNps;
    }

    public HrNpsRecommendVO getHrNpsRecommend() {
        return hrNpsRecommend;
    }

    public void setHrNpsRecommend(HrNpsRecommendVO hrNpsRecommend) {
        this.hrNpsRecommend = hrNpsRecommend;
    }
}
