package com.moseeker.vo.position;

import com.moseeker.vo.company.basic.HrCompanyFeatureVO;
import com.moseeker.vo.company.basic.HrCompanyVO;
import com.moseeker.vo.company.basic.HrTeamVO;
import com.moseeker.vo.company.basic.UserHrAccountVO;
import com.moseeker.vo.dict.basic.DictCityVO;
import com.moseeker.vo.dict.basic.DictConstantVO;
import com.moseeker.vo.dict.basic.DictIndustryVO;
import com.moseeker.vo.position.basic.JobCustomVO;
import com.moseeker.vo.position.basic.JobOccupationVO;
import com.moseeker.vo.position.basic.JobPositionAggreVO;
import com.moseeker.vo.position.basic.JobPositionVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * {link @Position}
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "职位信息模型 ")
public class PositionAggreVO implements Serializable{

	private static final long serialVersionUID = 4607611443712168790L;
	@ApiModelProperty(value = "job_position职位数据" ,required = false)
	private JobPositionAggreVO position;
	@ApiModelProperty(value = "工资数据" ,required = false)
	private SalaryData salaryData;
	@ApiModelProperty(value = "招聘类型数据" ,required = false)
	private DictConstantVO candidateData;
	@ApiModelProperty(value = "学历数据" ,required = false)
	private DictConstantVO degreeData;
	@ApiModelProperty(value = "性别数据" ,required = false)
	private DictConstantVO genderData;
	@ApiModelProperty(value = "工作类型数九" ,required = false)
	private DictConstantVO employeeTypeData;
	@ApiModelProperty(value = "自定义字段数据" ,required = false)
	private JobCustomVO jobCustom;
	@ApiModelProperty(value = "自定义职位职能数据" ,required = false)
	private JobOccupationVO jobOccupation;
	@ApiModelProperty(value = "团队数据" ,required = false)
	private HrTeamVO team;
	@ApiModelProperty(value = "公司数据" ,required = false)
	private HrCompanyVO company;
	@ApiModelProperty(value = "职位福利特色数据" ,required = false)
	private List<HrCompanyFeatureVO> feature;
	@ApiModelProperty(value = "城市字典数据" ,required = false)
	private List<DictCityVO> citys;
	@ApiModelProperty(value = "职位相关信息数据" ,required = false)
	private JobPositionOtherVO other;
	@ApiModelProperty(value = "查询数据，es不分词的部分" ,required = false)
	private SearchData searchData;
	@ApiModelProperty(value = "行业数据" ,required = false)
	private DictIndustryVO dictIndustryData;
	@ApiModelProperty(value = "hr信息",required = false)
	private UserHrAccountVO hr;

}
