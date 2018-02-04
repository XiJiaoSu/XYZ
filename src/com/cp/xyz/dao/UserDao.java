package com.cp.xyz.dao;

import com.cp.xyz.pojo.User;

public class UserDao {

	public static User findUserByNameAndPwd(String username,String password){
		User user = new User();;
		if(username.equals("test")&&password.equals("1234"))
		{
			user.setUsername(username);
			user.setId("1");
			user.setPassword("1234");
			user.setGender(0);
			user.setMail("test@mail.com");
			user.setAddress("西安");
			user.setBrith("20180101");
			user.setIDcard("110110110");
			user.setPhone(Integer.parseInt("82668110"));
			
		}else{
			user = null;
		}
		return user;
	}
	
	public static User findUserByName(String username){
		User user;
		if(username.equals("test")){
			user = new User();		
		}else{
			user = null;
		}
		return user;
	}
	
	public static User register(User user){
		return null;
	}
}
