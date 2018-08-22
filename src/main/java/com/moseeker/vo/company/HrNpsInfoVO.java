package com.moseeker.vo.company;

/**
 * Created by moseeker on 2018/6/6.
 */
public class HrNpsInfoVO {
    private int id;
    private String date;
    private int hrAccountId;
    private String hrMobile;
    private Byte hrAccountType;
    private String company;
    private Byte intention;
    private Byte acceptContact;
    private String recommendUser;
    private String recommendMobile;
    private String recommendCompany;
    private int companyId;
    private int companyType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHrAccountId() {
        return hrAccountId;
    }

    public void setHrAccountId(int hrAccountId) {
        this.hrAccountId = hrAccountId;
    }

    public String getHrMobile() {
        return hrMobile;
    }

    public void setHrMobile(String hrMobile) {
        this.hrMobile = hrMobile;
    }

    public Byte getHrAccountType() {
        return hrAccountType;
    }

    public void setHrAccountType(Byte hrAccountType) {
        this.hrAccountType = hrAccountType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getRecommendUser() {
        return recommendUser;
    }

    public void setRecommendUser(String recommendUser) {
        this.recommendUser = recommendUser;
    }

    public String getRecommendMobile() {
        return recommendMobile;
    }

    public void setRecommendMobile(String recommendMobile) {
        this.recommendMobile = recommendMobile;
    }

    public String getRecommendCompany() {
        return recommendCompany;
    }

    public void setRecommendCompany(String recommendCompany) {
        this.recommendCompany = recommendCompany;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCompanyType() {
        return companyType;
    }

    public void setCompanyType(int companyType) {
        this.companyType = companyType;
    }
}
