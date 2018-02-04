package com.cp.xyz.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.xyz.pojo.Goods;

public class GoodsDao {
	
	public static List<Goods> showGoodsByNum(int from,int to){
		ArrayList<Goods> lists = new ArrayList<Goods>();
		//from 和 to 逻辑为写 只要 from < to 即返回
		if(from < to){
			Goods goods = new Goods();
			goods.setId("123");
			goods.setName("酸奶");
			goods.setPrice((float) 12.3);
			goods.setType("副食");
			goods.setDescription("助消化");
			Goods goods1 = new Goods();
			goods1.setId("124");
			goods1.setName("薯片");
			goods1.setPrice((float) 12.3);
			goods1.setType("副食");
			goods1.setDescription("清脆可口");
			lists.add(goods);
			lists.add(goods1);
		}else{
			lists = null;
		}
		return lists;
	}
   
	public static Goods findGoodsById(String uid){
		Goods goods = new Goods();
		if("123".equals(uid))
		{
			goods.setId("123");
			goods.setName("酸奶");
			goods.setPrice((float) 12.3);
			goods.setType("副食");
			goods.setDescription("助消化");
			
		}else{
			goods = null;
		}
		return goods;
	}
	
	
}
