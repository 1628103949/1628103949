package com.zy.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index/")
public class IndexController {
	
	@RequestMapping("test")
	public String index(){
		System.out.println("hello index...");
		return "hello spring boot";
	}

}
