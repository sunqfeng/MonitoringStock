package com.xue.triggertask;

import java.time.LocalDateTime;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.alibaba.druid.util.StringUtils;
import com.xue.controller.SysLoginController;
import com.xue.entity.model.Cron;
import com.xue.service.sys.CronService;
import com.xue.service.sys.TimedTask;
import com.xue.service.sys.Impl.TimedTaskImpl;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class DynamicScheduleTask implements SchedulingConfigurer {

	private static final Logger log = LoggerFactory.getLogger(DynamicScheduleTask.class);

	public static DynamicScheduleTask dynamicScheduleTask;

	@Autowired
	private CronService cronService;

	Cron cron = new Cron();

	@Autowired
	private TimedTask obj;

	@PostConstruct 
    public void init() {  
		dynamicScheduleTask = this;  
		dynamicScheduleTask.obj = this.obj ;
        // 初使化时将已静态化的otherService实例化
    }  


	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		// TODO Auto-generated method stub
		

		try {
			taskRegistrar.addTriggerTask(
			        //1.添加任务内容(Runnable)
//                () -> System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime()),
					()-> obj.TimedTaskSqfShares(),
			        //2.设置执行周期(Trigger)
			        triggerContext -> {
			            //2.1 从数据库获取执行周期
			        	cron = cronService.selectByPrimaryKey("1");
//                    System.out.println("cron==="+cron);
			            //2.2 合法性校验.
			            if (StringUtils.isEmpty(cron.getCron())) {
			                // Omitted Code ..
			            }
			            //2.3 返回执行周期(Date)
			            return new CronTrigger(cron.getCron()).nextExecutionTime(triggerContext);
			        }
			);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

	}

}
