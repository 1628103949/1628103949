package com.zy.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.dao.UserInfoDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo11ApplicationTests {
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void insertTest(){
		UserInfo userInfo = new UserInfo();
		userInfo.setName("张三");
		userInfo.setSex("1");
		userInfoDao.save(userInfo);
	}
	
	@Test
	public void updateTest(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo.setName("李四");
		userInfo.setSex("0");
		userInfoDao.save(userInfo);
	}
	
	@Test
	public void deleteTest(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfoDao.delete(userInfo);
	}
	
	@Test
	public void queryTest0(){
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1);
		userInfo = userInfoDao.findOne(userInfo.getId());
		System.out.println("user.name = " + userInfo.getName());
	}
	
	@Test
	public void queryTest1(){
		List<UserInfo> list = userInfoDao.findByNameAndSex("张三","1");
		for(UserInfo userInfo : list){
			System.out.println("user.id = " + userInfo.getId() + " user.name = " + userInfo.getName());
		}
	}
	
	@Test
	public void queryTest2(){
		List<UserInfo> list = userInfoDao.findByNameLike("%张%");
		for(UserInfo userInfo : list){
			System.out.println("user.id = " + userInfo.getId() + " user.name = " + userInfo.getName());
		}
	}
	
	@Test
	public void queryTest3(){
		List<UserInfo> list = userInfoDao.findByName("%张%");
		for(UserInfo userInfo : list){
			System.out.println("user.id = " + userInfo.getId() + " user.name = " + userInfo.getName());
		}
	}
	
	@Test
	public void queryTest4(){
		Pageable pageable = new PageRequest(0, 2);
		Page<UserInfo> page = userInfoDao.findByNameLike("%张%", pageable);
		for(UserInfo userInfo : page.getContent()){
			System.out.println("user.id = " + userInfo.getId() + " user.name = " + userInfo.getName());
		}
	}
}
