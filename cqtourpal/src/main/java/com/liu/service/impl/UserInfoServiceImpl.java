package com.liu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.mapper.UserInfoMapper;
import com.liu.po.UserInfo;
import com.liu.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource(name = "userInfoMapper")
	private UserInfoMapper userInfoMapper;

	public boolean add(UserInfo user) {

		int i = userInfoMapper.insertSelective(user);

		if (i > 0) {
			return true;
		}

		return false;
	}

	public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
		this.userInfoMapper = userInfoMapper;
	}

	public List<UserInfo> getUserList(UserInfo record) {

		if (record != null && record.getUserName() != null
				&& !record.getUserName().equals("")) {
			record.setUserName("%" + record.getUserName() + "%");
		}

		return userInfoMapper.getUserList(record);
	}

	public UserInfo getUser(String userNumber) {
		// TODO Auto-generated method stub
		return userInfoMapper.selectByPrimaryKey(userNumber);
	}

	public boolean update(UserInfo user) {
		int i = userInfoMapper.updateByPrimaryKeySelective(user);

		if (i > 0) {
			return true;
		}
		return false;
	}

	public boolean delete(String userNumber) {
		int i = userInfoMapper.deleteByPrimaryKey(userNumber);
		System.out.println(i);
		if (i > 0) {
			return true;
		}
		return false;
	}

}
