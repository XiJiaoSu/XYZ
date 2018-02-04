package com.cp.xyz.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.xyz.dao.OrderDao;
import com.cp.xyz.pojo.Order;
import com.cp.xyz.service.OrderService;

@Service("OrderService")
public class OrderServiceImp implements OrderService{

	
	@Override
	public Order findOrderByUidAndId(String uid, String id) throws Exception {
		return OrderDao.findOrderByUidAndId(uid, id);
	}

	@Override
	public List<Order> findListByUid(String uid) throws Exception {
		return OrderDao.findListByUid(uid);
	}

}
