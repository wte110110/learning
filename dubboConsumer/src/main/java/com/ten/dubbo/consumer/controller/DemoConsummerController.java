package com.ten.dubbo.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ten.dubbo01.service.DemoService;

@Controller
@RequestMapping("consummer")
public class DemoConsummerController {
	@Reference(version = "1.0.0")
	DemoService demoservice;
	
	@RequestMapping("say")
	@ResponseBody
	public String consummerSay() {
		return demoservice.sayHello("lili");
		
	}
}
