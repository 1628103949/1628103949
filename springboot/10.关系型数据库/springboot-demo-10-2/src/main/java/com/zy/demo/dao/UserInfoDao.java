package com.zy.demo.dao;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.util.base.Page;

public interface UserInfoDao {
	public int insertUserInfo(UserInfo userInfo);
	public int deleteUserInfo(UserInfo userInfo);
	public int updateUserInfo(UserInfo userInfo);
	public UserInfo getUserInfo(UserInfo userInfo);
	public Page<UserInfo> queryForPage(int pageCurrent,int pageSize,UserInfo userInfo);
}
