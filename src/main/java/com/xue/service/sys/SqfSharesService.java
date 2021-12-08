package com.xue.service.sys;

import com.xue.entity.model.SqfShares;

public interface SqfSharesService {


	SqfShares selectByPrimaryKey(Integer id);

	SqfShares selall_by_securities_code_whether_monitor(String securities_code,String whether_monitor );

	int insert(SqfShares record);

}
