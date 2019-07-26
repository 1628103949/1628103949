package com.zy.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.service.UserInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo13ApplicationTests {
	@Autowired
	private UserInfoService userInfoService;
	@Test
	public void contextLoads() {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setName("李四");
		userInfo.setSex("0");
		userInfoService.update(userInfo);
	}
	
	@Test
	public void contextLoads1() {
		UserInfo userInfo = userInfoService.findById(1);
		System.out.println("userInfo.name = " + userInfo.getName());
	}

}
