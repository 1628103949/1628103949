package com.liu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liu.mapper.ViewInfoMapper;
import com.liu.po.ViewInfo;
import com.liu.service.ViewInfoService;

@Service
public class ViewInfoServiceImpl implements ViewInfoService {

	@Resource(name = "viewInfoMapper")
	private ViewInfoMapper viewInfoMapper;

	public boolean add(ViewInfo info) {

		int i = viewInfoMapper.insertSelective(info);
		if (i > 0) {
			return true;
		}

		return false;
	}

	public void setViewInfoMapper(ViewInfoMapper viewInfoMapper) {
		this.viewInfoMapper = viewInfoMapper;
	}

	public List<ViewInfo> getList(ViewInfo info) {

		if (info != null && info.getViewName() != null
				&& !info.getViewName().equals("")) {
			info.setViewName("%" + info.getViewName() + "%");
		}

		return viewInfoMapper.getViewInfoList(info);
	}

	public ViewInfo getInfo(Integer viewId) {

		return viewInfoMapper.selectByPrimaryKey(viewId);
	}

	public boolean update(ViewInfo info) {

		int i = viewInfoMapper.updateByPrimaryKeySelective(info);
		if (i > 0) {
			return true;
		}

		return false;
	}

	public boolean delete(Integer viewId) {
		int i = viewInfoMapper.deleteByPrimaryKey(viewId);
		if(i>0){
			return true;
		}
		return false;
	}

}
