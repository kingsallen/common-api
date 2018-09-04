package com.moseeker.vo.jooq;

import com.moseeker.vo.BasePagerVo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class JooqVo extends BasePagerVo<JooqVo> {

	private static final long serialVersionUID = 4607611443712168790L;

	@ApiModelProperty(value = "类型")
	private String type;

	@ApiModelProperty(value = "数据库字段key")
	private String key;
	
	@ApiModelProperty(value = "数据库字段value")
	private String value;
	
	@ApiModelProperty(value = "状态")
	private String status;
	
}
