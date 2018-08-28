package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/5/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginInfoVO {

    public String mobile;
    public String email;
    public String password;
    public int wxuserId;
    public String lastLoginIp;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWxuserId() {
        return wxuserId;
    }

    public void setWxuserId(int wxuserId) {
        this.wxuserId = wxuserId;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
}
