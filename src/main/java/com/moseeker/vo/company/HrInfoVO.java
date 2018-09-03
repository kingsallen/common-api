package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.UserHrAccountVO;

/**
 * Created by moseeker on 2018/5/23.
 */
public class HrInfoVO {
    public UserHrAccountVO account;
    public String nickname;
    public String country;
    public String province;
    public int companyCreated;
    public String headimgurl;
    public String openid;

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
}
