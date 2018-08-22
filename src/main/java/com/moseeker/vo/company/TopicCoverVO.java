package com.moseeker.vo.company;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by moseeker on 2018/6/14.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TopicCoverVO {
    private String shareTitle;
    private String shareLogo;
    private String shareDescription;

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public String getShareLogo() {
        return shareLogo;
    }

    public void setShareLogo(String shareLogo) {
        this.shareLogo = shareLogo;
    }

    public String getShareDescription() {
        return shareDescription;
    }

    public void setShareDescription(String shareDescription) {
        this.shareDescription = shareDescription;
    }
}
