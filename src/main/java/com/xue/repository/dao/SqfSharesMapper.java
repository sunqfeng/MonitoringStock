package com.xue.repository.dao;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.SqfSharesExample;
import org.apache.ibatis.annotations.Param;

public interface SqfSharesMapper {
    long countByExample(SqfSharesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SqfShares record);

    int insertSelective(SqfShares record);

    SqfShares selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SqfShares record, @Param("example") SqfSharesExample example);

    int updateByExample(@Param("record") SqfShares record, @Param("example") SqfSharesExample example);

    int updateByPrimaryKeySelective(SqfShares record);

    int updateByPrimaryKey(SqfShares record);

    SqfShares selall_by_securities_code_whether_monitor(@Param("securities_code") String securities_code,@Param("whether_monitor") String whether_monitor );
}