package com.cp.xyz.service;

import java.util.List;

import com.cp.xyz.pojo.Demo;

public interface DemoService {

	/**
	 * Demo 查询
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Demo findDemoById(String id) throws Exception;
	
	/**
	 * Demo 更新
	 * @param demo
	 * @return
	 * @throws Exception
	 */
	public Demo updateDemo(Demo demo)throws Exception;
	
	/**
	 * Demo 插入
	 * @param demo
	 * @return
	 * @throws Exception
	 */
	public Demo insertDemo(Demo demo)throws Exception;
	
	
	/**
	 * 查询所有的Demo，没有分页查询
	 * @return
	 * @throws Exception
	 */
	public List<Demo> queryAll()throws Exception;
	
}
