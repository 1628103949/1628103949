package com.zy.demo.dao;

import com.zy.demo.bean.UserInfo;

public interface UserInfoDao {
	public int insertUserInfo(UserInfo userInfo);
	public int deleteUserInfo(UserInfo userInfo);
	public int updateUserInfo(UserInfo userInfo);
	public UserInfo getUserInfo(UserInfo userInfo);
}
