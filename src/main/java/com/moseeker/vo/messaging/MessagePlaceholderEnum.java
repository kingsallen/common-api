package com.moseeker.vo.messaging;

import com.moseeker.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public enum MessagePlaceholderEnum {

    position_title("positionTitle","${positionTitle}","#职位名称#","keyword1"),position_starttime("positionStarttime","${positionStarttime}","#入职日期#",""),position_location("positionLocation","${positionLocation}","#入职地点#",""),applied_position("appliedPosition","${appliedPosition}","#应聘职位#","keyword1"),
    hr_name("hrName","${hrName}","#HR姓名#",""),hr_mobile("hrMobile","${hrMobile}","#HR电话#",""),hr_email("hrEmail","${hrEmail}","#HR邮箱#",""),
    applier_name("applierName","${applierName}","#求职者姓名#","keyword2"),applier_phone("applierPhone","${applierPhone}","#求职者电话#",""),applier_email("applierEmail","${applierEmail}","#求职者邮箱#",""),
    company_name("companyName","${companyName}","#公司名称#","company"),company_abbreviation("companyAbbreviation","${companyAbbreviation}","#公司简称#",""),
    hr_wx_name("hrWxName","${hrWxName}","#公众号名称#",""),
    salary_type("salarType","${salarType}","#薪资类别#",""),salary("salary","${salary}","#薪资数额#",""),
    profile_submit_date("profileSubmitDate","${profileSubmitDate}","#投递时间#","time"),
    interview_date("interviewDate","${interviewDate}","#面试日期#","keyword3"),interview_day_time("interviewDayTime","${interviewDayTime}","#面试时间#",""),changed_interview_date("changedInterviewDate","${changedInterviewDate}","#变更后的面试日期#",""),changed_interview_day_time("changedInterviewDayTime","${changedInterviewDayTime}","#变更后的面试时间#",""),interview_time("interviewTime","${interviewTime}","#面试时长#",""),interview_type("interviewType","${interviewType}","#面试形式#",""),interview_location("interviewLocation","${interviewLocation}","#面试地点#","keyword4"),original_interview_type("originalInterviewType","${originalInterviewType}","#原面试形式#",""),
    headhunter_name("headhunterName","${headhunterName}","#猎头姓名#",""),headhunter_company("headhunterCompany","${headhunterCompany}","#猎头公司#",""),
    callback_url("callbackUrl","${callbackUrl}","#相关连接#",""),
    deadline("deadline","${deadline}","#截止日期#",""),
    rqcode("rqcode","${rqcode}","#二维码#",""),
    interviewer_name("interviewerName","${interviewerName}","#面试官姓名#",""),
    recommended_name("recommendedName","${recommendedName}","#被推荐者姓名#",""),recommended_phone("recommendedPhone","${recommendedPhone}","#被推荐者电话#",""),recommended_reason("recommendedReason","${recommendedReason}","#被推荐原因#",""),
    recommender_name("recommenderName","${recommenderName}","#推荐人姓名#",""),recommender_role("recommenderRole","${recommenderRole}","#推荐人角色#",""),
    reciver_name("reciverName","${reciverName}","#接收人#",""),
    link("link","${link}","#链接#",""),
    full_time("fullTime","${fullTime}","#完整时间#","keyword3")
    ;
    private String key;
    private String mqPlaceholder;
    private String htmlPlaceholder;
    private String wxPlaceholder;

    private static Map<String,MessagePlaceholderEnum> mapHTML= new HashMap<>();
    private static Map<String,MessagePlaceholderEnum> mapMQ= new HashMap<>();

    static {
        for (MessagePlaceholderEnum csat : values()) {
            mapHTML.put(csat.getHtmlPlaceholder(), csat);
            mapMQ.put(csat.getKey(),csat);
        }
    };

    MessagePlaceholderEnum(String key, String mqPlaceholder, String htmlPlaceholder,String wxPlaceholder) {
        this.key = key;
        this.mqPlaceholder = mqPlaceholder;
        this.htmlPlaceholder = htmlPlaceholder;
        this.wxPlaceholder = wxPlaceholder;
    }

    public String getMqPlaceholder() {
        return mqPlaceholder;
    }

    public void setMqPlaceholder(String mqPlaceholder) {
        this.mqPlaceholder = mqPlaceholder;
    }

    public String getHtmlPlaceholder() {
        return htmlPlaceholder;
    }

    public String getWxPlaceholder() {
        return wxPlaceholder;
    }

    public void setWxPlaceholder(String wxPlaceholder) {
        this.wxPlaceholder = wxPlaceholder;
    }

    public void setHtmlPlaceholder(String htmlPlaceholder) {
        this.htmlPlaceholder = htmlPlaceholder;
    }

    public String getKey() {
        return key;
    }

    public static MessagePlaceholderEnum instanceFromKey(String key) {
        if (StringUtils.isNotNullOrEmpty(key) ) {
            if(mapHTML.get(key) != null){
                return mapHTML.get(key);
            }else if((mapMQ.get(key) != null)){
                return mapMQ.get(key);
            }
        }
        return null;

    }
}

