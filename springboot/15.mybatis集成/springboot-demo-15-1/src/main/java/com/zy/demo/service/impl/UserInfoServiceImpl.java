package com.zy.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.dao.UserInfoDao;
import com.zy.demo.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	
	@Override
	public UserInfo findById(Integer id) {
		System.out.println("查找 id = " + id + "的数据");
		return userInfoDao.findById(id);
	}
	
}
