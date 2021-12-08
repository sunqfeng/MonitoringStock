package com.xue.service.sys;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xue.entity.model.User;

public interface UserService {
	
	//增
	public int addUser(User user);
	//删
	public int deleteUser(int id);
	//改	
	public int updateUser(User user);
	//查	
	public List<User> getUser();
	
	

}
