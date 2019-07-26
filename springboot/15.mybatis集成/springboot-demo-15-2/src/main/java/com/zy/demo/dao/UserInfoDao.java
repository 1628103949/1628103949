package com.zy.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zy.demo.bean.UserInfo;

@Mapper
public interface UserInfoDao{
	public UserInfo findById(Integer id);
	
}
