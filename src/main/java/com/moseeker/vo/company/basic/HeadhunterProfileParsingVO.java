package com.moseeker.vo.company.basic;

import com.moseeker.vo.profile.basic.*;
import com.moseeker.vo.user.basic.UserUserVO;
import lombok.Data;

import java.util.List;

/**
 *  猎头简历格式
 * @param
 * @return
 * @Author lee
 * @Date 2019/4/11 12:55
 */
@Data
public class HeadhunterProfileParsingVO {
    private UserUserVO user;
    private ProfileProfileVO profile;
    private ProfileBasicVO basic;
    private List<ProfileAttachmentVO> attachments;
    private List<ProfileAwardsVO> awards;
    private List<ProfileCredentialsVO> credentials;
    private List<ProfileEducationVO> educations;
    private ProfileImportVO imports;
    private List<ProfileIntentionVO> intentions;
    private List<ProfileLanguageVO> languages;
    private ProfileOtherVO other;
    private List<ProfileProjectexpVO> projectExps;
    private List<ProfileSkillVO> skills;
    private List<ProfileWorkexpVO> workExps;
    private List<ProfileWorksVO> works;
}
