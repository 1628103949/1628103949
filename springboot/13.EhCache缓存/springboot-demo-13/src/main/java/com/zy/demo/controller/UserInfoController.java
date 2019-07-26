package com.zy.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.service.UserInfoService;

@Controller
@RequestMapping("/userinfo/")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("show")
	public String show(UserInfo userInfo,Model model){
		userInfo = userInfoService.findById(userInfo.getId());
		model.addAttribute("user", userInfo);
		return "index";
	}
	
	@RequestMapping("update")
	public String update(String name){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setName(name);
		userInfo.setSex("0");
		userInfoService.update(userInfo);
		return "index";
	}
	
}
