package com.moseeker.vo.user.basic;

import lombok.Data;

/**
 * Created by moseeker on 2018/6/5.
 */
@Data
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

}
