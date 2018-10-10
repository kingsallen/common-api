package com.moseeker.vo.talentpool.request;

import lombok.Data;

/**
 * Created by moseeker on 2018/9/29.
 */
@Data
public class SearchTalentNumVO {

    private String publisher;
    private String allPublisher;
    private String tagIds;
    private Integer hrId;
    private Integer companyId;
    private Integer hrAccountId;
    private Integer companyTag;

}
