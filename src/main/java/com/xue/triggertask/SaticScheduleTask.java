package com.xue.triggertask;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.xue.entity.model.SqfShares;
import com.xue.repository.dao.SqfSharesMapper;
import com.xue.service.sys.Impl.TimedTaskImpl;

/*
 * springboot 定时器
 * 
 */

@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
@Component
public class SaticScheduleTask {

	private Logger log = Logger.getLogger(SaticScheduleTask.class);

/*
秒（0~59） 例如0/5表示每5秒
分（0~59）
时（0~23）
日（0~31）的某天，需计算
月（0~11）
周几（ 可填1-7 或 SUN/MON/TUE/WED/THU/FRI/SAT） 
 */

	@Autowired
	private SqfSharesMapper sqfshMapper;

	@Autowired
	private TimedTaskImpl timedTaskImpl;

	SqfShares sqfShares = new SqfShares();

//	TimedTaskImpl timedTaskImpl = new TimedTaskImpl();


	//3.添加定时任务
    @Scheduled(cron = "0 0/60 9-16 * * ?")
    //或直接指定时间间隔，例如：5秒
    //@Scheduled(fixedRate=5000)
    private void configureTasks() {

    	log.debug("configureTasks>>>>>>>>>>>>>>>>>>>>>begin");

    	timedTaskImpl.TimedTaskSqfShares();

    	log.debug("configureTasks>>>>>>>>>>>>>>>>>>>>>end");

    }


}
