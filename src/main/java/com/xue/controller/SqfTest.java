package com.xue.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xue.tools.PtSqfTest;

@Controller
@RequestMapping("/sys/test")
public class SqfTest {

	@Autowired
	private PtSqfTest ptSqfTest ;


	@RequestMapping(value = "/sqf")
	public String uploadPage() {


		ptSqfTest.sqftest();

		return "vuetest"; // 过度跳转页
	}
}

