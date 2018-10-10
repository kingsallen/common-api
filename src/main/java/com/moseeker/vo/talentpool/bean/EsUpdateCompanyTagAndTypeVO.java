package com.moseeker.vo.talentpool.bean;

import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/25.
 */
@Data
public class EsUpdateCompanyTagAndTypeVO {

    private Integer tagId;
    private List<Integer> userIds;
    private Integer type;
}
