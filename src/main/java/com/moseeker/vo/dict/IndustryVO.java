package com.moseeker.vo.dict;

import com.moseeker.vo.dict.basic.DictIndustryTypeVO;

import java.util.List;

/**
 * Created by jack on 2018/5/21.
 */
public class IndustryVO {

    private int code;
    private String name;
    private String companyImg;
    private String jobImg;
    private String teamImg;
    private String pcImg;
    private int parentCode;

    public void cloneFromIndustryType(DictIndustryTypeVO type) {
        if (type != null) {
            if (type.getCode() != null) {
                setCode(type.getCode());
            }
            setName(type.getName());
            setCompanyImg(type.getCompanyImg());
            setJobImg(type.getJobImg());
            setTeamImg(type.getTeamImg());
            setPcImg(type.getPcImg());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndustryVO)) return false;

        IndustryVO industry = (IndustryVO) o;

        return getCode() == industry.getCode();
    }

    @Override
    public int hashCode() {
        return getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public String getJobImg() {
        return jobImg;
    }

    public void setJobImg(String jobImg) {
        this.jobImg = jobImg;
    }

    public String getTeamImg() {
        return teamImg;
    }

    public void setTeamImg(String teamImg) {
        this.teamImg = teamImg;
    }

    public String getPcImg() {
        return pcImg;
    }

    public void setPcImg(String pcImg) {
        this.pcImg = pcImg;
    }

    private List<IndustryVO> industries;

    public List<IndustryVO> getIndustries() {
        return industries;
    }

    public void setIndustries(List<IndustryVO> industries) {
        this.industries = industries;
    }

    public int getParentCode() {
        return parentCode;
    }

    public void setParentCode(int parentCode) {
        this.parentCode = parentCode;
    }
}
