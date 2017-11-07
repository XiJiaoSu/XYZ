package com.cp.xyz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.xyz.pojo.Demo;
import com.cp.xyz.service.DemoService;

@Controller
@RequestMapping(value="/demo/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class DemoController {

	@Autowired
	@Qualifier("demoService")
	private DemoService demoService;
	
	
	@RequestMapping(value="all",method = RequestMethod.GET)
	public List<Demo> getAllDemos()throws Exception{
		Demo demo=new Demo();
		demo.setAge(1);
		demo.setName("name");
		List<Demo> lists=new ArrayList<Demo>();
		lists.add(demo);
		demoService.queryAll();
		return demoService.queryAll();
	}
	
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public Demo addDemo()throws Exception{
		Demo demo=new Demo();
		demo.setAge(new Random().nextInt(100));
		demo.setName("name"+new Random().nextInt(200));
		return demoService.insertDemo(demo);
	}
	
}
