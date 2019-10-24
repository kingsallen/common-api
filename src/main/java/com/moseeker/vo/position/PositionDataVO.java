package com.moseeker.vo.position;

import com.moseeker.vo.application.AppStatusCountVO;
import com.moseeker.vo.company.basic.HrCompanyFeatureVO;
import com.moseeker.vo.dict.basic.DictCityVO;
import com.moseeker.vo.jobboard.HrThirdPartyPositionVO;
import com.moseeker.vo.position.basic.JobPositionVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by zztaiwll on 18/8/28.
 */
@ApiModel(value = "职位数据大全")
@Data
public class PositionDataVO {
    @ApiModelProperty(value = "职位数据",name="position",required = true)
    private JobPositionVO position;
    @ApiModelProperty(value = "团队名称",name="teamName",required = false)
    private String teamName;
    @ApiModelProperty(value = "学历名称",name="degreeName",required = false)
    private String degreeName;
    @ApiModelProperty(value = "工作类型",name="employeeName",required = false)
    private String employeeName;
    @ApiModelProperty(value = "招聘类型",name="candidateName",required = false)
    private String candidateName;
    @ApiModelProperty(value = "性别",name="genderName",required = false)
    private String genderName;
    @ApiModelProperty(value = "城市数据",name="citys",required = false)
    private List<DictCityVO> citys;
    @ApiModelProperty(value = "公司名称",name="companyName",required = false)
    private String companyName;
    @ApiModelProperty(value = "发布人名称",name="publisherName",required = false)
    private String publisherName;
    @ApiModelProperty(value = "职位福利特色",name="feature",required = false)
    private List<HrCompanyFeatureVO> feature;
    @ApiModelProperty(value = "职位名模板名称",name="cvTemplateName",required = false)
    private String cvTemplateName;
    @ApiModelProperty(value = "最近申请数量",name="resumeNewCount",required = false)
    private Integer resumeNewCount;
    @ApiModelProperty(value = "申请数量",name="resumeCount",required = false)
    private Integer resumeCount;
    @ApiModelProperty(value = "第三方职位的信息",name="syncInfo",required = false)
    private List<HrThirdPartyPositionVO> syncInfo;
    @ApiModelProperty(value = "职位上不同申请状态的数量",name="appProcessNum",required = false)
    private List<AppStatusCountVO> appProcessNum;

}
