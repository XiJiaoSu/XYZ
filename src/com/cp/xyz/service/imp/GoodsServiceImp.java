package com.cp.xyz.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.xyz.dao.GoodsDao;
import com.cp.xyz.exception.entity.BaseException;
import com.cp.xyz.pojo.Goods;
import com.cp.xyz.service.GoodsService;

@Service("GoodsService")
public class GoodsServiceImp implements GoodsService{

	@Override
	public List<Goods> showGoodsByNum(int form, int to) throws BaseException {
		return GoodsDao.showGoodsByNum(form, to);
	}

	@Override
	public Goods findGoodsById(String uid) throws BaseException {
		// TODO Auto-generated method stub
		return GoodsDao.findGoodsById(uid);
	}

	
	
}
