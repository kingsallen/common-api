package com.moseeker.vo.company.basic;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Timestamp;

/**
 * HrHeadhunterCompanyVO
 *
 * @Author: lee
 * @Date: 2019/2/15
 */
@Data
public class HrHeadhunterCompanyVO {

    private Integer   id;
    private String    name;
    private String    shortName;
    @ApiModelProperty(value = "创建时间", dataType= "string", example = "2019-02-15 17:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;
    @ApiModelProperty(value = "更新时间", dataType= "string", example = "2019-02-15 18:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp updateTime;
}
