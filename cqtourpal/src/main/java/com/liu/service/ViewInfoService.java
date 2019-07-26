package com.liu.service;

import java.util.List;

import com.liu.po.ViewInfo;

/**
 * 景区管理的业务逻辑接口
 * @author 老牛
 *
 */
public interface ViewInfoService {

	/**
	 * 添加景区
	 * @param info
	 * @return
	 */
	public boolean add(ViewInfo info);
	
	/**
	 * 根据条件查询景区信息
	 * @param info
	 * @return
	 */
	public List<ViewInfo> getList(ViewInfo info);
	
	/**
	 * 根据编号查询景区信息
	 * @param viewId 编号
	 * @return
	 */
	public ViewInfo getInfo(Integer viewId);
	
	/**
	 * 修改景区信息
	 * @param info
	 * @return
	 */
	public boolean update(ViewInfo info);
	
	/**
	 * 根据编号删除景区信息
	 * @param viewId
	 * @return
	 */
	public boolean delete(Integer viewId);
	
}
