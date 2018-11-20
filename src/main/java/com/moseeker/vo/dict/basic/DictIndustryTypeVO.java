package com.moseeker.vo.dict.basic;

import lombok.Data;

import java.io.Serializable;

/**
 * @Date: 2018/11/20
 * @Author: JackYang
 */
@Data
public class DictIndustryTypeVO implements Serializable{
    private static final long serialVersionUID = -6856809337493049742L;
    private Integer code;
    private String  name;
    private String  companyImg;
    private String  jobImg;
    private String  teamImg;
    private String  pcImg;
}
