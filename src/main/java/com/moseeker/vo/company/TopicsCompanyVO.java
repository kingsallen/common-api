package com.moseeker.vo.company;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicsCompanyVO {
    private Integer id;
    private String address;//公司地址.
    private String name;//公司名称
    private String industry;//公司所属行业.
    private String introduction;//公司介绍.
    private String abbreviation;//公司简称.
    private String hrwxlogo;//HR微信logo.
    private String hrname;//HR姓名.
    private String logo;//公司logo.
    private String scale;//公司人数.
    private List<String> features;//被切分的福利特色.

}
