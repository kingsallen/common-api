package com.moseeker.vo.jooq;

import com.moseeker.vo.BasePagerVo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class JooqVo extends BasePagerVo<JooqVo> {

	private static final long serialVersionUID = 4607611443712168790L;

	private String type;

	private String key;
	
	private String value;
	
	private String status;
	
}
