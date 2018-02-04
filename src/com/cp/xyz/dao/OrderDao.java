package com.cp.xyz.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.xyz.pojo.Order;

public class OrderDao {
	
	public static Order findOrderByUidAndId(String uid,String id){
		Order order = new Order();
		if("123".equals(uid)&&"123".equals(id)){
			order.setId("123");
			order.setUid("123");
			order.setBillId("1");
			order.setName("聚美优品");
			order.setoTime(201824);
			order.setItems(null);
		}else{
			return null;
		}
		return order;
	}
	
	public static List<Order> findListByUid(String uid){
		ArrayList<Order> lists = new ArrayList<Order>();
		if("123".equals(uid)){
			Order order = new Order();
			order.setId("123");
			order.setUid("123");
			order.setBillId("1");
			order.setName("聚美优品");
			order.setoTime(201824);
			order.setItems(null);
			Order order1 = new Order();
			order1.setId("124");
			order1.setUid("123");
			order1.setBillId("1");
			order1.setName("京东商城");
			order1.setoTime(201824);
			order1.setItems(null);
			lists.add(order);
			lists.add(order1);
		}else{
			lists = null;
		}
		return lists;
	} 
}
