package com.moseeker.vo.user.basic;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/5.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserWxUserVO {
    public int id;
    public int wechatId;
    public int groupId;
    public int sysuserId;
    public byte isSubscribe;
    public String openid;
    public String nickname;
    public int sex;
    public String city;
    public String country;
    public String province;
    public String language;
    public String headimgurl;
    public String subscribeTime;
    public String unsubscibeTime;
    public String unionid;
    public int reward;
    public double autoSyncInfo;
    public String createTime;
    public String updateTime;
    public double source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWechatId() {
        return wechatId;
    }

    public void setWechatId(int wechatId) {
        this.wechatId = wechatId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(int sysuserId) {
        this.sysuserId = sysuserId;
    }

    public byte getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(byte isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    public String getUnsubscibeTime() {
        return unsubscibeTime;
    }

    public void setUnsubscibeTime(String unsubscibeTime) {
        this.unsubscibeTime = unsubscibeTime;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public double getAutoSyncInfo() {
        return autoSyncInfo;
    }

    public void setAutoSyncInfo(double autoSyncInfo) {
        this.autoSyncInfo = autoSyncInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public double getSource() {
        return source;
    }

    public void setSource(double source) {
        this.source = source;
    }
}
