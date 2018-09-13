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
            setCode(dictIndustryPO.getCode());
            setName(dictIndustryPO.getName());
            setParentName(dictIndustryTypePO.getName());
            setCompanyImg(dictIndustryTypePO.getCompanyImg());
            setJobImg(dictIndustryTypePO.getJobImg());
            setTeamImg(dictIndustryTypePO.getTeamImg());
            setPcImg(dictIndustryTypePO.getPcImg());
            setParentCode(dictIndustryPO.getType());
        }
    }
    /**
     * 获取一级行业类型
     * @param   dictIndustryTypePO 行业类型po
     * @author  cjm
     * @date  2018/9/12
     */
    public void cloneFromIndustryType(DictIndustryTypePO dictIndustryTypePO) {
        if (dictIndustryTypePO != null) {
            setCode(dictIndustryTypePO.getCode());
            setName(dictIndustryTypePO.getName());
            setParentName("");
            setCompanyImg(dictIndustryTypePO.getCompanyImg());
            setJobImg(dictIndustryTypePO.getJobImg());
            setTeamImg(dictIndustryTypePO.getTeamImg());
            setPcImg(dictIndustryTypePO.getPcImg());
            setParentCode(0);
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


    @Override
    public int hashCode() {
        return getCode();
    }
}
