package com.xue.repository.dao;

import com.xue.entity.model.Cron;
import com.xue.entity.model.CronExample;
import org.apache.ibatis.annotations.Param;

public interface CronMapper {
    long countByExample(CronExample example);

    int deleteByPrimaryKey(String cronId);

    int insert(Cron record);

    int insertSelective(Cron record);

    Cron selectByPrimaryKey(String cronId);

    int updateByExampleSelective(@Param("record") Cron record, @Param("example") CronExample example);

    int updateByExample(@Param("record") Cron record, @Param("example") CronExample example);

    int updateByPrimaryKeySelective(Cron record);

    int updateByPrimaryKey(Cron record);
}