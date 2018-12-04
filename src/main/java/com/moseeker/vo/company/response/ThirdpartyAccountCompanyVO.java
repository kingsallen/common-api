package com.moseeker.vo.company.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Date: 2018/12/3
 * @Author: JackYang
 */
@Data
public class ThirdpartyAccountCompanyVO implements Serializable {
    private static final long serialVersionUID = 5913584919387575126L;

    private Integer   id;
    @ApiModelProperty(value = "第三方渠道账号的编号")
    private Integer   accountId;
    @ApiModelProperty(value = "公司名称")
    private String    companyName;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp createTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp updateTime;
}
