//package com.xue.triggertask;
//
//import java.time.LocalDateTime;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.scheduling.support.CronTrigger;
//import org.springframework.stereotype.Controller;
//
//import com.alibaba.druid.util.StringUtils;
//import com.xue.service.sys.CronService;
//
//@Configuration      //1.主要用于标记配置类，兼备Component的效果。
//@EnableScheduling   // 2.开启定时任务
//public class DynamicScheduleTask implements SchedulingConfigurer {
//
//	@Autowired
//	CronService cronService;
//
//	@Override
//	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//		// TODO Auto-generated method stub
//
//		taskRegistrar.addTriggerTask(
//                //1.添加任务内容(Runnable)
////                () -> System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime()),
//				()-> System.out.println("11111"),
//                //2.设置执行周期(Trigger)
//                triggerContext -> {
//                    //2.1 从数据库获取执行周期
//                    String cron = cronService.selectByPrimaryKey("1").getCron();
////                    System.out.println("cron==="+cron);
//                    //2.2 合法性校验.
//                    if (StringUtils.isEmpty(cron)) {
//                        // Omitted Code ..
//                    }
//                    //2.3 返回执行周期(Date)
//                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
//                }
//        );
//
//		taskRegistrar.addTriggerTask(
//                //1.添加任务内容(Runnable)
////                () -> System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime()),
//				()-> System.out.println("22222"),
//                //2.设置执行周期(Trigger)
//                triggerContext -> {
//                    //2.1 从数据库获取执行周期
//                    String cron = cronService.selectByPrimaryKey("2").getCron();
////                    System.out.println("cron==="+cron);
//                    //2.2 合法性校验.
//                    if (StringUtils.isEmpty(cron)) {
//                        // Omitted Code ..
//                    }
//                    //2.3 返回执行周期(Date)
//                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
//                }
//        );
//
//
//
//	}
//
//}
