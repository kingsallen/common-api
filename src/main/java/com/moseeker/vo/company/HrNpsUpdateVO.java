package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/6.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrNpsUpdateVO {

    private Integer userId;
    private String startDate;
    private String endDate;
    private Byte intention;
    private Byte acceptContact;
    private String username;
    private String mobile;
    private String company;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Byte getIntention() {
        return intention;
    }

    public void setIntention(Byte intention) {
        this.intention = intention;
    }

    public Byte getAcceptContact() {
        return acceptContact;
    }

    public void setAcceptContact(Byte acceptContact) {
        this.acceptContact = acceptContact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
