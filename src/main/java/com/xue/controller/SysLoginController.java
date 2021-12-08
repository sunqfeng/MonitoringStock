package com.xue.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xue.entity.model.SqfShares;
import com.xue.entity.model.User;
import com.xue.repository.dao.SqfSharesMapper;
import com.xue.service.sys.PictureDeal;
import com.xue.service.sys.SqfSharesService;
import com.xue.service.sys.TimedTask;
import com.xue.service.sys.UserService;

@RestController
@RequestMapping("/sys/acct")
public class SysLoginController {
	

	@Autowired
	private UserService userService;

	@Autowired
	private SqfSharesService sqfshaService;

	@Reference
	private TimedTask tiemTask;

	SqfShares sqfShares = new SqfShares();

	@RequestMapping("/test")
	public void test()
	{

		tiemTask.TimedTaskSqfShares();
//		sqfShares = sqfshaService.selall_by_securities_code_whether_monitor("300657", "1");
		System.out.println("sqf=="+sqfShares.getSecuritiesCode());
		System.out.println("hello,world");
		System.out.println("hello,world");
		System.out.println("hello,world1111");
		System.out.println("hello,world222");

	}


	//增
	@RequestMapping("/addUser")
	public int addUser(){
		
		//向数据库添加两条记录
		
		User user = new User();
		user.setName("zhang san ");
		user.setPassword("123456");	
		
		User user1 = new User();
		user1.setName("li si");
		user1.setPassword("123456");	
		
		int result = userService.addUser(user);
		
		int result1 = userService.addUser(user1);
		
		return result & result1;
	}
	//删
	@RequestMapping("/deleteUser")
	public int deleteUser(){
		
		//删除数据中中第一条记录
		int result = userService.deleteUser(1);
		
		return result;
	}
	
	@RequestMapping("/updataUser")
	public int updateUser(){
		
		//修改数据库中第二条记录
		
		User user = new User();
		user.setId(2);
		user.setName("chen er");
		user.setPassword("123");
		int result = userService.updateUser(user);	
		return result;
	}
	
	
	@RequestMapping("/showUser")
	public List<User> getUserInfo(){
		
		//查询数据库user表中所有记录
		
		List<User> user = userService.getUser();
		
		return user;
		
	}
	

}
