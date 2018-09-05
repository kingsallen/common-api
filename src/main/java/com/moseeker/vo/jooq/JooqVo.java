package com.moseeker.vo.jooq;

import java.util.List;

import com.moseeker.vo.BaseVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class JooqVo extends BaseVo {

	private static final long serialVersionUID = 4607611443712168790L;

	@ApiModelProperty(value = "类型")
	private String type;

	@ApiModelProperty(value = "数据库字段key")
	private String key;
	
	@ApiModelProperty(value = "数据库字段value")
	private String value;
	
	@ApiModelProperty(value = "状态")
	private String status;
	
	@ApiModelProperty(value = "描述（数组）")
	private List<String> description;
	
}
