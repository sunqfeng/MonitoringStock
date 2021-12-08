package com.xue.service.sys.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xue.entity.model.SqfShares;
import com.xue.service.sys.SqfSharesService;
import com.xue.service.sys.TimedTask;

@Component
public class TimedTaskImpl implements TimedTask {
	
	private static final Logger log = LoggerFactory.getLogger(TimedTaskImpl.class);


	@Autowired
	private SqfSharesService sqfSharesService;

	SqfShares sqfShares = new SqfShares();

	@Override
	public void TimedTaskSqfShares() {
		// TODO Auto-generated method stub
		System.out.println("TimedTaskSqfShares>>>>>>");

		sqfShares = sqfSharesService.selall_by_securities_code_whether_monitor("300657", "1");

		log.debug("wooooooo=="+sqfShares.getSecuritiesName());


	}

}
