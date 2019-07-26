package com.liu.service;

import java.util.List;

import com.liu.po.UserInfo;

/**
 * 用户管理的业务逻辑接口
 * <p>
 * @author 老牛
 * </P>
 * <p>
 * 时间：2015-09-30
 * </P>
 * 
 */
public interface UserInfoService {

	/**
	 * 添加用户信息
	 * 
	 * @param user
	 *            参数
	 * @return true成功 false失败
	 */
	public boolean add(UserInfo user);

	/**
	 * 查询用户信息
	 * 
	 * @param record
	 *            查询条件
	 * @return
	 */
	public List<UserInfo> getUserList(UserInfo record);

	/**
	 * 根据账号查询用户信息
	 * 
	 * @param userNumber
	 * @return
	 */
	public UserInfo getUser(String userNumber);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 *            参数
	 * @return true成功 false失败
	 */
	public boolean update(UserInfo user);
	
	/**
	 * 删除用户信息
	 * 
	 * @param userNumber
	 *            参数
	 * @return true成功 false失败
	 */
	public boolean delete(String userNumber);
}
