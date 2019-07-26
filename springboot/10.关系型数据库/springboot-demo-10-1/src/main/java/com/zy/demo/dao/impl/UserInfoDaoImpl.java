package com.zy.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.zy.demo.bean.UserInfo;
import com.zy.demo.dao.UserInfoDao;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public int insertUserInfo(UserInfo userInfo) {
		String sql = "insert into t_userinfo(t_name) values(?)";
		return template.update(sql, userInfo.getName());
	}

	@Override
	public int deleteUserInfo(UserInfo userInfo) {
		String sql = "delete from t_userinfo where t_id = ?";
		return template.update(sql, userInfo.getId());
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		String sql = "update t_userinfo set t_name = ? where t_id = ?";
		return template.update(sql, userInfo.getName(),userInfo.getId());
	}

	@Override
	public UserInfo getUserInfo(UserInfo userInfo) {
		String sql = "select * from t_userinfo where t_id = ?";
		return template.queryForObject(sql, new RowMapper<UserInfo>(){

			@Override
			public UserInfo mapRow(ResultSet arg0, int arg1) throws SQLException {
				UserInfo userInfo = new UserInfo();
				userInfo.setId(arg0.getInt(1));
				userInfo.setName(arg0.getString(2));
				return userInfo;
			}
			
		},userInfo.getId());
	}
	
}
