package com.moseeker.vo.position.basic;

import java.sql.Timestamp;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/22.
 */
@Data
@EqualsAndHashCode(callSuper = false)

public class JobPositionVO {
    private Integer   id;
    private String    jobnumber;
    private Integer   companyId;
    private String    title;
    private String    province;
    private String    city;
    private String    department;
    private Integer   lJobid;
    private Timestamp publishDate;
    private Timestamp stopDate;
    private String    accountabilities;
    private String    experience;
    private String    requirement;
    private String    salary;
    private String    language;
    private Integer   jobGrade;
    private Byte      status;
    private Integer   visitnum;
    private String    lastvisit;
    private Integer   sourceId;
    private Timestamp updateTime;
    private String    businessGroup;
    private Byte      employmentType;
    private String    hrEmail;
    private String    benefits;
    private Byte      degree;
    private List<String> featureList;
    private Byte      emailNotice;
    private Byte      candidateSource;
    private String    occupation;
    private Integer   isRecom;
    private String    industry;
    private Integer   hongbaoConfigId;
    private Integer   hongbaoConfigRecomId;
    private Integer   hongbaoConfigAppId;
    private Byte      emailResumeConf;
    private Integer   lPostingtargetid;
    private Byte      priority;
    private Integer   shareTplId;
    private String    district;
    private Short     count;
    private Integer   salaryTop;
    private Integer   salaryBottom;
    private Byte      experienceAbove;
    private Byte      degreeAbove;
    private Byte      managementExperience;
    private Byte      gender;
    private Integer   publisher;
    private Integer   appCvConfigId;
    private Short     source;
    private Byte      hbStatus;
    private Integer   childCompanyId;
    private Byte      age;
    private String    majorRequired;
    private String    workAddress;
    private String    keyword;
    private String    reportingTo;
    private Byte      isHiring;
    private Byte      underlings;
    private Byte      languageRequired;
    private Byte      targetIndustry;
    private Byte      currentStatus;
    private Integer   positionCode;
    private Integer   teamId;
    private Byte      profileCcMailEnabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getlJobid() {
        return lJobid;
    }

    public void setlJobid(Integer lJobid) {
        this.lJobid = lJobid;
    }

    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    public Timestamp getStopDate() {
        return stopDate;
    }

    public void setStopDate(Timestamp stopDate) {
        this.stopDate = stopDate;
    }

    public String getAccountabilities() {
        return accountabilities;
    }

    public void setAccountabilities(String accountabilities) {
        this.accountabilities = accountabilities;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(Integer jobGrade) {
        this.jobGrade = jobGrade;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getVisitnum() {
        return visitnum;
    }

    public void setVisitnum(Integer visitnum) {
        this.visitnum = visitnum;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public String getBusinessGroup() {
        return businessGroup;
    }

    public void setBusinessGroup(String businessGroup) {
        this.businessGroup = businessGroup;
    }

    public Byte getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(Byte employmentType) {
        this.employmentType = employmentType;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public Byte getDegree() {
        return degree;
    }

    public void setDegree(Byte degree) {
        this.degree = degree;
    }

    public List<String> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<String> featureList) {
        this.featureList = featureList;
    }

    public Byte getEmailNotice() {
        return emailNotice;
    }

    public void setEmailNotice(Byte emailNotice) {
        this.emailNotice = emailNotice;
    }

    public Byte getCandidateSource() {
        return candidateSource;
    }

    public void setCandidateSource(Byte candidateSource) {
        this.candidateSource = candidateSource;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getIsRecom() {
        return isRecom;
    }

    public void setIsRecom(Integer isRecom) {
        this.isRecom = isRecom;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getHongbaoConfigId() {
        return hongbaoConfigId;
    }

    public void setHongbaoConfigId(Integer hongbaoConfigId) {
        this.hongbaoConfigId = hongbaoConfigId;
    }

    public Integer getHongbaoConfigRecomId() {
        return hongbaoConfigRecomId;
    }

    public void setHongbaoConfigRecomId(Integer hongbaoConfigRecomId) {
        this.hongbaoConfigRecomId = hongbaoConfigRecomId;
    }

    public Integer getHongbaoConfigAppId() {
        return hongbaoConfigAppId;
    }

    public void setHongbaoConfigAppId(Integer hongbaoConfigAppId) {
        this.hongbaoConfigAppId = hongbaoConfigAppId;
    }

    public Byte getEmailResumeConf() {
        return emailResumeConf;
    }

    public void setEmailResumeConf(Byte emailResumeConf) {
        this.emailResumeConf = emailResumeConf;
    }

    public Integer getlPostingtargetid() {
        return lPostingtargetid;
    }

    public void setlPostingtargetid(Integer lPostingtargetid) {
        this.lPostingtargetid = lPostingtargetid;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Integer getShareTplId() {
        return shareTplId;
    }

    public void setShareTplId(Integer shareTplId) {
        this.shareTplId = shareTplId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }

    public Integer getSalaryTop() {
        return salaryTop;
    }

    public void setSalaryTop(Integer salaryTop) {
        this.salaryTop = salaryTop;
    }

    public Integer getSalaryBottom() {
        return salaryBottom;
    }

    public void setSalaryBottom(Integer salaryBottom) {
        this.salaryBottom = salaryBottom;
    }

    public Byte getExperienceAbove() {
        return experienceAbove;
    }

    public void setExperienceAbove(Byte experienceAbove) {
        this.experienceAbove = experienceAbove;
    }

    public Byte getDegreeAbove() {
        return degreeAbove;
    }

    public void setDegreeAbove(Byte degreeAbove) {
        this.degreeAbove = degreeAbove;
    }

    public Byte getManagementExperience() {
        return managementExperience;
    }

    public void setManagementExperience(Byte managementExperience) {
        this.managementExperience = managementExperience;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Integer getAppCvConfigId() {
        return appCvConfigId;
    }

    public void setAppCvConfigId(Integer appCvConfigId) {
        this.appCvConfigId = appCvConfigId;
    }

    public Short getSource() {
        return source;
    }

    public void setSource(Short source) {
        this.source = source;
    }

    public Byte getHbStatus() {
        return hbStatus;
    }

    public void setHbStatus(Byte hbStatus) {
        this.hbStatus = hbStatus;
    }

    public Integer getChildCompanyId() {
        return childCompanyId;
    }

    public void setChildCompanyId(Integer childCompanyId) {
        this.childCompanyId = childCompanyId;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getMajorRequired() {
        return majorRequired;
    }

    public void setMajorRequired(String majorRequired) {
        this.majorRequired = majorRequired;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getReportingTo() {
        return reportingTo;
    }

    public void setReportingTo(String reportingTo) {
        this.reportingTo = reportingTo;
    }

    public Byte getIsHiring() {
        return isHiring;
    }

    public void setIsHiring(Byte isHiring) {
        this.isHiring = isHiring;
    }

    public Byte getUnderlings() {
        return underlings;
    }

    public void setUnderlings(Byte underlings) {
        this.underlings = underlings;
    }

    public Byte getLanguageRequired() {
        return languageRequired;
    }

    public void setLanguageRequired(Byte languageRequired) {
        this.languageRequired = languageRequired;
    }

    public Byte getTargetIndustry() {
        return targetIndustry;
    }

    public void setTargetIndustry(Byte targetIndustry) {
        this.targetIndustry = targetIndustry;
    }

    public Byte getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Byte currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Integer getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(Integer positionCode) {
        this.positionCode = positionCode;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Byte getProfileCcMailEnabled() {
        return profileCcMailEnabled;
    }

    public void setProfileCcMailEnabled(Byte profileCcMailEnabled) {
        this.profileCcMailEnabled = profileCcMailEnabled;
    }
}
