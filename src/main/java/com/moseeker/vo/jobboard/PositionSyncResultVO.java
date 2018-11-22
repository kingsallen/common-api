package com.moseeker.vo.jobboard;

import lombok.Data;

/**
 * 同步结果
 * @author wjf
 *
 */
@Data
public class PositionSyncResultVO {
	public final static int SUCCESS=2;
	public final static int FAIL=3;

	private int position_id;
	private int channel;
	private int sync_status;
	private String sync_time;
	private String sync_fail_reason;
	private int account_id;
	private String data;

}
