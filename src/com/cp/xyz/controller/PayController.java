package com.cp.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/pay/", 
	produces = "application/json;charset=utf-8")
@ResponseBody
public class PayController {

}
