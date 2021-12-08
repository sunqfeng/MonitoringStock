package com.xue.service.sys.Impl;

import java.util.List;

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

	@Override
	public int insert(SqfShares record) {
		// TODO Auto-generated method stub
		return dao.insert(record);
	}

	@Override
	public List<SqfShares> selall_by_whether_monitor(String whether_monitor) {
		// TODO Auto-generated method stub

		return dao.selall_by_whether_monitor(whether_monitor);
	}

}
