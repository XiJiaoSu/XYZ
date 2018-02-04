package com.cp.xyz.service;

import java.util.List;

import com.cp.xyz.exception.entity.BaseException;
import com.cp.xyz.pojo.Goods;

public interface GoodsService {
	
	public List<Goods> showGoodsByNum(int form,int to) throws BaseException;
	
	public Goods findGoodsById(String uid) throws BaseException;
	
}
