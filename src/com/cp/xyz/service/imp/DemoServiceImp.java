package com.cp.xyz.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cp.xyz.dao.DemoDao;
import com.cp.xyz.pojo.Demo;
import com.cp.xyz.service.DemoService;

@Service("demoService")
public class DemoServiceImp implements DemoService{

	@Autowired
	@Qualifier("demoDao")
	private DemoDao demoDao;
	
	@Override
	public Demo findDemoById(String id) throws Exception {
		return null;
	}

	@Override
	public Demo updateDemo(Demo demo) throws Exception {
		return null;
	}

	@Override
	public Demo insertDemo(Demo demo) throws Exception {
		int index=demoDao.insertDemo(demo);
		System.out.println(index);
		return demoDao.selectDemoByDemo(demo);
	}

	@Override
	public List<Demo> queryAll() throws Exception {
		System.out.println("111111111");
		return demoDao.queryAllDemos();
	}

}
