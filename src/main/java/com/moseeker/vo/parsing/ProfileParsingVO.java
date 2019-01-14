package com.moseeker.vo.parsing;

import com.moseeker.vo.profile.basic.*;
import com.moseeker.vo.user.basic.UserUserVO;
import lombok.Data;

import java.util.List;

@Data
public class ProfileParsingVO {

    private UserUserVO userVO;
    private ProfileProfileVO profileVO;
    private ProfileBasicVO basicVO;
    private List<ProfileAttachmentVO> attachmentVOs;
    private List<ProfileAwardsVO> awardsVOs;
    private List<ProfileCredentialsVO> credentialsVOs;
    private List<ProfileEducationVO> educationVOs;
    private ProfileImportVO importVOs;
    private List<ProfileIntentionVO> intentionVOs;
    private List<ProfileLanguageVO> languageVOs;
    private ProfileOtherVO otherVO;
    private List<ProfileProjectexpVO> projectExps;
    private List<ProfileSkillVO> skillVOs;
    private List<ProfileWorkexpVO> workexpVOs;
    private List<ProfileWorksVO> worksVOs;

}
