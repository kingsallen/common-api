package com.moseeker.vo.talentpool.bean;

import com.moseeker.vo.talentpool.basc.TalentpoolTagVO;
import java.util.List;
import java.util.Set;
import lombok.Data;

/**
 * Created by zztaiwll on 18/1/11.
 */
@Data
public class ValidateTagBean {
    //状态
    private int status;
    //错误信息
    private String errorMessage;
    private List<TalentpoolTagVO> hrTagList;
    private Set<Integer> idList;
    private  Set<Integer> userTagIdList;
    private Set<Integer> nouseList;


}
