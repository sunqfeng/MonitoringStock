package com.xue.repository.dao;

import com.xue.entity.model.Employees;
import com.xue.entity.model.EmployeesExample;
import org.apache.ibatis.annotations.Param;

public interface EmployeesMapper {
    long countByExample(EmployeesExample example);

    int deleteByPrimaryKey(Integer empNo);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer empNo);

    int updateByExampleSelective(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByExample(@Param("record") Employees record, @Param("example") EmployeesExample example);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}