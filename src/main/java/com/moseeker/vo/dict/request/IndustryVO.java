package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictIndustryPO;
import com.moseeker.vo.dict.basic.DictIndustryTypePO;
import lombok.Data;
import lombok.ToString;

/**
 * @date 2018/08/31
 * @author cjm
 */
@Data
@ToString
public class IndustryVO {

    private Integer code;
    private String name;
    private String companyImg;
    private String jobImg;
    private String teamImg;
    private String pcImg;
    private Integer parentCode;
    private String parentName;

    public void cloneFromIndustryType(DictIndustryPO dictIndustryPO, DictIndustryTypePO dictIndustryTypePO) {
        if (dictIndustryPO != null && dictIndustryTypePO != null) {
            setParentName(dictIndustryTypePO.getName());
            setCompanyImg(dictIndustryTypePO.getCompanyImg());
            setJobImg(dictIndustryTypePO.getJobImg());
            setTeamImg(dictIndustryTypePO.getTeamImg());
            setPcImg(dictIndustryTypePO.getPcImg());
            setParentCode(dictIndustryPO.getCode());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndustryVO)) {
            return false;
        }

        IndustryVO industry = (IndustryVO) o;

        return getCode().equals(industry.getCode());
    }

}
