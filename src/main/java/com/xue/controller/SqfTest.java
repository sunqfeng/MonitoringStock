package com.xue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xue.entity.model.Employees;
import com.xue.repository.dao.EmployeesMapper;
import com.xue.tools.PtSqfTest;

@Controller
@RequestMapping("/sys/test")
public class SqfTest {

	@Autowired
	private EmployeesMapper employeesMapper;

	@RequestMapping(value = "/sqf")
	public String uploadPage() {

		Employees employees =  employeesMapper.selectByPrimaryKey(1);
		System.out.println("employees=="+employees.getEmpNo() + "|" + employees.getFirstName());

		return null;
//		return "vuetest"; // 过度跳转页.

	}
}

