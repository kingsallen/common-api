package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.UserHrAccountVO;
import com.moseeker.vo.user.basic.UserWxUserVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrInfoVO {
    private UserHrAccountVO account;
    private String nickname;
    private String country;
    private String province;
    private int companyCreated;
    private String headimgurl;
    private String openid;
    private UserWxUserVO wxUser;
    private String signature;

}
