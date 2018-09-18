package com.moseeker.vo.company.basic;

import java.sql.Timestamp;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/8/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CampaignPcBannerVO {
    private Integer   id;
    private String    href;
    private String    imgUrl;
    private Byte      disable;
    private Timestamp createTime;
    private Timestamp updateTime;


}
