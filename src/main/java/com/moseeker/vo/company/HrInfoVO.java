package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.UserHrAccountVO;
import com.moseeker.vo.user.basic.UserWxUserVO;

/**
 * Created by moseeker on 2018/5/23.
 */
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

    public UserHrAccountVO getAccount() {
        return account;
    }

    public void setAccount(UserHrAccountVO account) {
        this.account = account;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getCompanyCreated() {
        return companyCreated;
    }

    public void setCompanyCreated(int companyCreated) {
        this.companyCreated = companyCreated;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public UserWxUserVO getWxUser() {
        return wxUser;
    }

    public void setWxUser(UserWxUserVO wxUser) {
        this.wxUser = wxUser;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
