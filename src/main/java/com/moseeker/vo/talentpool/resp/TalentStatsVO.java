package com.moseeker.vo.talentpool.resp;

import com.moseeker.vo.talentpool.basc.TalentpoolCompanyTagVO;
import com.moseeker.vo.talentpool.basc.TalentpoolTagVO;
import java.util.List;
import lombok.Data;

/**
 * Created by moseeker on 2018/9/26.
 */
@Data
public class TalentStatsVO {

    private Integer allpublic;
    private Integer hrpublic;
    private Integer talent;
    private List<TalentpoolTagVO> tag;
    private Integer alltalent;
    private List<TalentpoolCompanyTagVO> companytag;


}
