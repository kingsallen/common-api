package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.basc.TalentpoolCompanyTagVO;
import com.moseeker.vo.talentpool.basc.TalentpoolTagVO;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/9/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserTagVO {
    List<TalentpoolTagVO> hrTags;
    List<TalentpoolCompanyTagVO> companyTags;
    private Integer userId;
}
