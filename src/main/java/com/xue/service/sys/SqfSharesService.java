package com.xue.service.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xue.entity.model.SqfShares;

public interface SqfSharesService {


	SqfShares selectByPrimaryKey(Integer id);

	SqfShares selall_by_securities_code_whether_monitor(String securities_code,String whether_monitor );

	int insert(SqfShares record);

	List<SqfShares> selall_by_whether_monitor( @Param("whether_monitor") String whether_monitor );

	int updateByPrimaryKeySelective(SqfShares record);

}
