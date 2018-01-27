package com.cp.xyz.service;

import com.cp.xyz.pojo.User;

public interface UserService {

	public User login(String username, String password) throws Exception;
	
	public User findUserByUsername(String username) throws Exception;
	
	public User register(User user);


	
	
	
}
