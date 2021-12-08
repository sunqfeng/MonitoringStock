package com.xue.service.sys.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.User;
import com.xue.repository.dao.UserMapper;
import com.xue.service.sys.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper dao;
	
	//增
	@Override
	public int addUser(User user) {
		
		int result = 0;
		try{
			result = dao.insert(user);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		return result;
	}

	
	//删
	@Override
	public int deleteUser(int id) {
		
		int	result =0;
		try {
			result = dao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}
	//改
	@Override
	public int updateUser(User user) {
		int result = 0;
		
		try {
			result = dao.updateByPrimaryKey(user);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return result;
	}

	//查
	@Override
	public List<User> getUser() {
		
		return dao.selectAllInfo();
	}
	

}
