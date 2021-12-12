package com.xue.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sys/test")
public class SqfTest {


	@RequestMapping(value = "/sqf")
	public String uploadPage() {
		return "vuetest"; // 过度跳转页
//		return "uploadPage"; // 过度跳转页
	}
}

