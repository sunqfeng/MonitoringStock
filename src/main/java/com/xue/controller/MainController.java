package com.xue.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * @au sqf
 */

@Controller
@RequestMapping("/sys/navigationbar")
public class MainController {

	public static Logger log = Logger.getLogger(MainController.class);


	@RequestMapping(value = "/navigationbarpage")
	public String uploadPage() {
		return "navigationbarpage"; // 过度跳转页
	}

}	