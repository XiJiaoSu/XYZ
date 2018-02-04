package com.cp.xyz.service;


import java.util.List;

import com.cp.xyz.pojo.Order;

public interface OrderService {
	
	public Order findOrderByUidAndId(String uid,String id) throws Exception;
	public List<Order> findListByUid(String uid) throws Exception;
	
}
