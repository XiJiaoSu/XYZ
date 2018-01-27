package com.cp.xyz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cp.xyz.exception.entity.BaseException;
import com.cp.xyz.pojo.json.ResponseObject;

@ControllerAdvice
public class DefaultException {

	@ExceptionHandler(BaseException.class)
	public ResponseEntity<ResponseObject> expection(BaseException e) {
		ResponseEntity<ResponseObject> entity = new ResponseEntity<ResponseObject>(e.productJsonObject(),
				HttpStatus.OK);
		return entity;
	}
	
}
