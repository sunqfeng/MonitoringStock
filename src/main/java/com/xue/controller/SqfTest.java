package com.xue.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sys/test")
public class SqfTest {


	@RequestMapping(value="/sqf", method = RequestMethod.GET)
	 public String Test( Map <String, Object> map )
	 {
		 
		 map.put("sqf", "wocao1111");

		 return "tpfyhy";
	 }

}

