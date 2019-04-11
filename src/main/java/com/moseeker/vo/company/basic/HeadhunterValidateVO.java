package com.moseeker.vo.company.basic;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * HeadhunterValidateVO
 *
 * @Author: lee
 * @Date: 2019/4/11
 */
@Data
@ApiModel("hr简历查重vo")
public class HeadhunterValidateVO {
    private Integer headhunterId;
    private String headhunterName;
    private String headhunterCompanyName;
    private Integer termOfProtection;
    private Integer userId;
}
