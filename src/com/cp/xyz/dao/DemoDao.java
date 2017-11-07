package com.cp.xyz.dao;

import java.util.List;

import com.cp.xyz.pojo.Demo;

public interface DemoDao {

	public List<Demo> queryAllDemos() throws Exception;
	
	public int insertDemo(Demo demo)throws Exception;
	
	/**
	 * 查询demo，主要用于添加一个demo之后的查询
	 * @param demo
	 * @return
	 * @throws Exception
	 */
	public Demo selectDemoByDemo(Demo demo)throws Exception;
	
	
	
}
