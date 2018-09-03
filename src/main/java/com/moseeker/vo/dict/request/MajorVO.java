package com.moseeker.vo.dict.request;

import com.moseeker.vo.dict.basic.DictMajorPO;

import java.util.List;

/**
 * Created by jack on 2018/5/30.
 */
public class MajorVO {

    private int code;
    private String name;
    private int level;
    private List<MajorVO> majors;

    public void cloneFromDictMajor(DictMajorPO dictMajor) {
        if (dictMajor == null) {
            return;
        }
        if (dictMajor.getCode() != null) {
            try {
                setCode(Integer.parseInt(dictMajor.getCode()));
            } catch (NumberFormatException e) {
                //do nothing
            }
        }
        if (dictMajor.getLevel() != null) {
            setLevel(dictMajor.getLevel());
        }
        setName(dictMajor.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MajorVO)) return false;

        MajorVO major = (MajorVO) o;

        return getCode() == major.getCode();
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<MajorVO> getMajors() {
        return majors;
    }

    public void setMajors(List<MajorVO> majors) {
        this.majors = majors;
    }
}
