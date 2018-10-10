package com.moseeker.vo.talentpool.bean;

import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/28.
 */
@Data
public class SearchProfileFilterListVO {

    private List<SearchProfileFilterVO> filterList;
    private Integer pageNumber;
    private Integer pageSize;
}
