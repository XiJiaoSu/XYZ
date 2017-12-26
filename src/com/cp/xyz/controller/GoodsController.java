package com.cp.xyz.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cp.xyz.pojo.Goods;
import com.cp.xyz.pojo.json.ResponseObject;
/**
 * 商品（保险）接口:
 * 	获取某范围类的商品列表，
 * 	获取某商品详情
 * 
 * @author chuang
 *
 */

@Controller
@RequestMapping(value="/goods/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class GoodsController {
	
	/**
	 * 获取from-to之间的商品列表
	 * @param from  开始
	 * @param to 结束
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="lists/{from}/{to}",method=RequestMethod.GET)
	public ResponseObject getGoodsList(
			@PathVariable("from") int from,
			@PathVariable("to") int to
			) throws Exception{
		 
		List<Goods> goods=new ArrayList<Goods>();
		
		return new ResponseObject(goods);
	}
	
	/**
	 * 根据商品的id获取当前商品的详情
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="detail/{id}",method=RequestMethod.GET)
	public ResponseObject getGoodsDetail(@PathVariable("id") String id) throws Exception{
		
		Goods goods=new Goods();
		goods.setName(id);
		goods.setDescription(id);
		goods.setId(id);
		return new ResponseObject(goods);
	}
	
	
}
