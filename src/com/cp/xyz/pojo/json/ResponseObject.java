package com.cp.xyz.pojo.json;

import java.io.Serializable;
/**
 * Controller 中@ReponseBody返回格式
 * @author chuang
 *
 */
public class ResponseObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code=100;
	private String msg="success";
	
	private Object contents;

	
	
	public ResponseObject() {
		super();
	}

	public ResponseObject(Object obj) {
		super();
		this.contents = obj;
	}

	public ResponseObject(int code, String msg, Object obj) {
		super();
		this.code = code;
		this.msg = msg;
		this.contents = obj;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Object getContents() {
		return contents;
	}

	public ResponseObject setContents(Object contents) {
		this.contents = contents;
		return this;
	}

	
	
	
	
	
}
