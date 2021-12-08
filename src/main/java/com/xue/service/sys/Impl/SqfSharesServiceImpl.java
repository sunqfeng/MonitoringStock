package com.xue.service.sys.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SqfShares;
import com.xue.repository.dao.SqfSharesMapper;
import com.xue.service.sys.SqfSharesService;

@Service
public class SqfSharesServiceImpl implements SqfSharesService {

	@Autowired
	private SqfSharesMapper dao;

	@Override
	public SqfShares selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(id);
	}

	@Override
	public SqfShares selall_by_securities_code_whether_monitor(String securities_code, String whether_monitor) {
		// TODO Auto-generated method stub
		return dao.selall_by_securities_code_whether_monitor(securities_code, whether_monitor);
	}

}