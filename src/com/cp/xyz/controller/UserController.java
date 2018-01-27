package com.cp.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.xyz.exception.entity.BaseException;
import com.cp.xyz.pojo.User;
import com.cp.xyz.pojo.json.ResponseObject;
import com.cp.xyz.service.UserService;

@Controller
@RequestMapping(value="/user/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class UserController {

	@Autowired
	@Qualifier("userService")
    private UserService userService;
	
	/**
	 * 用户登录
	 * @param username 用户名 
	 * @param password 密码
	 * @return json数据
	 * @throws Exception 
	 */
	@RequestMapping(value="login/{username}/{password}",method=RequestMethod.GET)
	public ResponseObject Login(@PathVariable("username")String username,@PathVariable("password")String password) throws Exception{
		
		 User user=userService.login(username, password);
		 if(user!=null){
		 	return new ResponseObject().setContents(user);
		 }else
		 {
			 throw new BaseException("用户名或密码错误");
		 }
	     
	}
	
	/**
	 * 用户注册
	 * @param user 用户对象
	 * @return json数据
	 * @throws Exception
	 */
	@RequestMapping(value="regist",method=RequestMethod.POST,consumes="application/json",produces = "application/json;charset=utf-8")
	public ResponseObject Regist(@RequestBody User user) throws Exception{
		
		String username=user.getUsername();
        // 如果数据库中没有该用户，可以注册，否则跳转页面
        if (userService.findUserByUsername(username) == null) {
            // 添加用户
            userService.register(user);
            return new ResponseObject().setContents("注册成功");
        }else {
        	//加入数据库逻辑
            throw new BaseException("用户名已经存在");
        }
	}
}
