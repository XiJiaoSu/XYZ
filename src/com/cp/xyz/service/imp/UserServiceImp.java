package com.cp.xyz.service.imp;

import org.springframework.stereotype.Service;

import com.cp.xyz.dao.UserDao;
import com.cp.xyz.pojo.User;
import com.cp.xyz.service.UserService;

@Service("userService")
public class UserServiceImp implements UserService {

	@Override
	public User login(String username, String password) throws Exception {
		return UserDao.findUserByNameAndPwd(username,password);
	}

	@Override
	public User findUserByUsername(String username) throws Exception {
		
		return UserDao.findUserByName(username);
	}

	@Override
	public User register(User user) {
		
		return null;
	}
	
}
