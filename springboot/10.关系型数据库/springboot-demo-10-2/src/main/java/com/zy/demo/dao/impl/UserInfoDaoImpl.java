package com.zy.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.StringUtils;
import com.zy.demo.bean.UserInfo;
import com.zy.demo.dao.UserInfoDao;
import com.zy.demo.util.base.AbstractJdbcDao;
import com.zy.demo.util.base.Page;
import com.zy.demo.util.base.Sql;

@Repository
public class UserInfoDaoImpl extends AbstractJdbcDao implements UserInfoDao{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insertUserInfo(UserInfo userInfo) {
		String sql = "insert into user_info(name) values(?)";
		return template.update(sql, userInfo.getName());
	}

	@Override
	public int deleteUserInfo(UserInfo userInfo) {
		String sql = "delete from user_info where id = ?";
		return template.update(sql, userInfo.getId());
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		String sql = "update user_info set name = ? where id = ?";
		return template.update(sql, userInfo.getName(),userInfo.getId());
	}

	@Override
	public UserInfo getUserInfo(UserInfo userInfo) {
		String sql = "select * from user_info where id = ?";
//		return template.queryForObject(sql, new RowMapper<UserInfo>(){
//
//			@Override
//			public UserInfo mapRow(ResultSet arg0, int arg1) throws SQLException {
//				UserInfo userInfo = new UserInfo();
//				userInfo.setId(arg0.getInt(1));
//				userInfo.setName(arg0.getString(2));
//				return userInfo;
//			}
//			
//		},userInfo.getId());
		return queryForObject(sql, UserInfo.class, userInfo.getId());
	}

	@Override
	public Page<UserInfo> queryForPage(int pageCurrent, int pageSize, UserInfo userInfo) {
//		String sql = "select * from user_info where name = ?";
//		return queryForPage(sql, pageCurrent, pageSize,UserInfo.class, userInfo.getName());
		
		StringBuffer sql = new StringBuffer("select * from user_info where 1");
		if(!StringUtils.isNullOrEmpty(userInfo.getName())){
			sql.append(" and name like '%").append(Sql.checkSql(userInfo.getName())).append("%'");
		}
		return queryForPage(sql.toString(), pageCurrent, pageSize,UserInfo.class);
	}
	
	
	
}
