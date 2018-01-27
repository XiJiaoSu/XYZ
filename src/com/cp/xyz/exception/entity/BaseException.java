package com.cp.xyz.exception.entity;

import com.cp.xyz.pojo.json.ResponseObject;

public class BaseException extends Exception {

	private int code = -100;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseException(int code, String message) {
		super(message, null);
		this.code = code;
	}

	public BaseException(String message) {
		super(message, null);
	}

	public BaseException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public int getErrorCode() {
		return code;
	}

	public void setErrorCode(int errorCode) {
		this.code = errorCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ResponseObject productJsonObject() {
		return new ResponseObject(code, getMessage(),null);
	}

}
