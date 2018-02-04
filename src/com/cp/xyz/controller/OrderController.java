package com.cp.xyz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.xyz.exception.entity.BaseException;
import com.cp.xyz.pojo.Order;
import com.cp.xyz.pojo.json.ResponseObject;
import com.cp.xyz.service.OrderService;

@Controller
@RequestMapping(value="/order/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class OrderController {
	
	@Autowired
	@Qualifier("OrderService")
	private OrderService orderService;

	@RequestMapping(value="lists/{uid}",method=RequestMethod.GET)
	public ResponseObject getOrdersList(@PathVariable("uid") String uid)throws Exception{
		
		//业务逻辑待完成
		List<Order>  orders= orderService.findListByUid(uid);
		if(orders!=null){
			return new ResponseObject().setContents(orders);
		}else{
			throw new BaseException("此订单不存在！");
		}
	}
	
	@RequestMapping(value="detail/{uid}/{oid}",method=RequestMethod.GET)
	public ResponseObject getOrderDetail(@PathVariable("uid") String uid,@PathVariable("oid") String oid)throws Exception{
		
		
		Order order= orderService.findOrderByUidAndId(uid, oid);
		if(order!=null){
			
			return new ResponseObject().setContents(order);
		}else{
			throw new BaseException("此订单不存在！");
		}		
	}
	
	
}
