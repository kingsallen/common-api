package com.moseeker.vo.user.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserUserVO {

    @ApiModelProperty("主key")
    private Integer id;
    @ApiModelProperty("国家代码，用 于支持国际短信")
    private String countryCode;
    @ApiModelProperty("用户名，目前存放已验证手机号或者unionid")
    private String username;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("是否禁用，0：可用，1：禁用")
    private Byte isDisable;
    @ApiModelProperty("用户等级")
    private Integer rank;
    @ApiModelProperty(value = "注册时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp registerTime;
    @ApiModelProperty("注册IP")
    private String registerIp;
    @ApiModelProperty(value = "最近登录时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp lastLoginTime;
    @ApiModelProperty("最近登录IP")
    private String lastLoginIp;
    @ApiModelProperty("登录次数")
    private Integer loginCount;
    @ApiModelProperty("手机号(未验证)")
    private Long mobile;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("is not activation 0:no 1:yes")
    private Byte activation;
    @ApiModelProperty("activation code")
    private String activationCode;
    @ApiModelProperty("")
    private String token;
    @ApiModelProperty("真实姓名")
    private String name;
    @ApiModelProperty("头像")
    private String headimg;
    @ApiModelProperty("国际电话区号ID")
    private Integer nationalCodeId;
    @ApiModelProperty("注册用户来自于哪个公众号, 0:默认为来自浏览器的用户")
    private Integer wechatId;
    @ApiModelProperty("存储仟寻服务号的unionid")
    private String unionid;
    @ApiModelProperty("来源：0:手机注册 1:聚合号一键登录 2:企业号一键登录 3:微信端百度 oauth 7:PC(正常添加) 8:PC(我要投递) 9:PC(我感兴趣) 10:PC(微信扫描后手机注册) 100:简历回收自动创建, 101支付宝, 103 程序导入(和黄)，102简历上传, 104 员工主动推荐")
    private Short source;
    @ApiModelProperty("点击我感兴趣时填写的公司")
    private String company;
    @ApiModelProperty("点击我感兴趣时填写的职位")
    private String position;
    @ApiModelProperty("合并到了新用户的id")
    private Integer parentid;
    @ApiModelProperty("用户昵称")
    private String nickname;
    @ApiModelProperty("邮箱是否认证 2:老数据 1:已认证 0:未认证")
    private Byte emailVerified;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
