package com.cp.xyz.pojo;

import java.util.List;

/**
 * 订单entity
 * @author Administrator
 *
 */
public class Order {

	private String id;
	private String name;
	private long oTime;//下单时间
	
	private String uid;//下单人的id
	
	private String billId;//发票id
	
	private List<OrderItem> items;//一个订单中可能有多分保险

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getoTime() {
		return oTime;
	}

	public void setoTime(long oTime) {
		this.oTime = oTime;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
}
