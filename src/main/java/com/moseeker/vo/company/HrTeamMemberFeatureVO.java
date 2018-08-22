package com.moseeker.vo.company;


import com.moseeker.vo.company.basic.HrTeamMemberVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/3/13.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class HrTeamMemberFeatureVO {
    private HrTeamMemberVO teamMember;
    private String imageLink;
    private String  resType;

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public HrTeamMemberVO getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(HrTeamMemberVO teamMember) {
        this.teamMember = teamMember;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }
}
