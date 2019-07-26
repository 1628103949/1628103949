package com.zy.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.zy.demo.bean.UserInfo;

@Mapper
public interface UserInfoDao{
	
	@Select("select * from user_info where id = #{id}")
	@Results(
			value={
					@Result(column="id",property="id"),
					@Result(column="name",property="name"),
					@Result(column="sex",property="sex")
			}
			)
	public UserInfo findById(Integer id);
	
}
