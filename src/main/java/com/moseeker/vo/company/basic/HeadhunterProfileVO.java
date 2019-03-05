package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.moseeker.vo.parsing.ProfileParsingVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * HeadhunterProfileVO
 *
 * @Author: lee
 * @Date: 2019/2/22
 */
@Data
@ApiModel("猎头上传简历")
public class HeadhunterProfileVO {
    private Integer id;
    @ApiModelProperty(value = "猎头账号Id")
    private Integer headhunterId;
    @ApiModelProperty(value = "简历姓名")
    private String userName;
    @ApiModelProperty(value = "简历邮箱")
    private String email;
    @ApiModelProperty(value = "简历手机号码")
    private String mobile;

    private ProfileParsingVO profileParsingVO;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType = "java.lang.String", example = "2018-12-10 10:12:45")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
