package com.xue.repository.dao;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.SqfSharesExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SqfSharesMapper {
    long countByExample(SqfSharesExample example);

    int deleteByPrimaryKey(Integer id);

    /*
     * 执行插入操作
     */
    int insert(SqfShares record); //执行插入操作

    int insertSelective(SqfShares record);

    SqfShares selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SqfShares record, @Param("example") SqfSharesExample example);

    int updateByExample(@Param("record") SqfShares record, @Param("example") SqfSharesExample example);

    int updateByPrimaryKeySelective(SqfShares record);

    int updateByPrimaryKey(SqfShares record);

    SqfShares selall_by_securities_code_whether_monitor(@Param("securities_code") String securities_code,@Param("whether_monitor") String whether_monitor );

    /**
     * 查询所有监控股票的记录
     * @param whether_monitor
     * @return
     */
    List<SqfShares> selall_by_whether_monitor( @Param("whether_monitor") String whether_monitor );

    SqfShares selall_by_securities_code_entrusted_price_purchase_entrusted_quantity_purchase( @Param("securities_code") String securities_code,@Param("entrusted_price_purchase") String entrusted_price_purchase,@Param("entrusted_quantity_purchase") String entrusted_quantity_purchase  );
}