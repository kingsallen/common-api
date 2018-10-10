package com.moseeker.vo.talentpool.bean;

import com.moseeker.vo.talentpool.basc.TalentpoolProfileFilterVO;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class SearchProfileFilterVO extends TalentpoolProfileFilterVO {

    private Integer hrId;
    private Integer accountType;
}
