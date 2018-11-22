package com.moseeker.vo.user.basic;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WXUserVO {
    @ApiModelProperty("主key")
    private Long id;
    @ApiModelProperty("所属公众号")
    private Integer wechatId;
    @ApiModelProperty("分组ID")
    private Integer groupId;
    @ApiModelProperty("user_user.id, C端用户ID")
    private Integer sysuserId;
    @ApiModelProperty("是否关注 1:关注 0：没关注")
    private Byte isSubscribe;
    @ApiModelProperty("用户标示")
    private String openid;
    @ApiModelProperty("用户昵称")
    private String nickname;
    @ApiModelProperty("用户性别 0:未知 1:男性 2:女性")
    private Integer sex;
    @ApiModelProperty("用户所在城市")
    private String city;
    @ApiModelProperty("用户所在国家")
    private String country;
    @ApiModelProperty("用户所在省份")
    private String province;
    @ApiModelProperty("用户语言")
    private String language;
    @ApiModelProperty("用户头像")
    private String headimgurl;
    @ApiModelProperty("用户关注时间")
    private String subscribeTime;
    @ApiModelProperty("用户取消关注时间")
    private String unsubscibeTime;
    @ApiModelProperty("UnionID")
    private String unionid;
    @ApiModelProperty("积分奖励，暂时不用")
    private Integer reward;
    @ApiModelProperty("0：需要处理，1：处理过了")
    private Byte autoSyncInfo;
    @ApiModelProperty("创建时间")
    private String createTime;
    @ApiModelProperty("更新时间")
    private String updateTime;
    @ApiModelProperty("insert来源 1:SUBSCRIBED 2:UNSUBSCRIBED 3:订阅号调用api的48001 4:oauth 5:update all 6:update short 7:oauth update 8:微信扫码注册 9:upd unionid 10:upd sysuser, 11:ups sysnuser 12：微信端我也要招人注册")
    private Byte source;
}
