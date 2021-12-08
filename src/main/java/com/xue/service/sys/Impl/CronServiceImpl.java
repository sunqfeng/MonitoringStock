package com.xue.service.sys.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xue.entity.model.Cron;
import com.xue.repository.dao.CronMapper;
import com.xue.service.sys.CronService;

@Component
public class CronServiceImpl implements CronService {

	@Autowired
	public CronMapper cronMapper;

	@Override
	public Cron selectByPrimaryKey(String cronId) {
		// TODO Auto-generated method stub

		return cronMapper.selectByPrimaryKey(cronId);

	}

}
