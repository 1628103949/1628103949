package com.zy.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.demo.component.ZyRedisComponent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo121ApplicationTests {
	
	@Autowired
	private ZyRedisComponent com;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void set(){
		com.set("com", "hello redis !!!");
	}
	
	@Test
	public void get(){
		System.out.println("com = " + com.get("com"));
	}

}
