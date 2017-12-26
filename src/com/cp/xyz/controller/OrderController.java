package com.cp.xyz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.xyz.pojo.Order;
import com.cp.xyz.pojo.json.ResponseObject;

@Controller
@RequestMapping(value="/order/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class OrderController {

	@RequestMapping(value="lists/{uid}",method=RequestMethod.GET)
	public ResponseObject getOrdersList(@PathVariable("uid") String uid)throws Exception{
		
		//业务逻辑待完成
		List<Order>  orders=new ArrayList<Order>();
		orders.add(new Order());
		orders.add(new Order());
		
		return new ResponseObject().setContents(orders);
		
	}
	
	@RequestMapping(value="detail/{uid}/{oid}",method=RequestMethod.GET)
	public ResponseObject getOrderDetail(@PathVariable("uid") String uid,@PathVariable("oid") String oid)throws Exception{
		
		//业务逻辑待完成
		Order order=new Order();
		order.setUid(uid);
		order.setId(oid);
		return new ResponseObject().setContents(order);
		
	}
	
	
}
