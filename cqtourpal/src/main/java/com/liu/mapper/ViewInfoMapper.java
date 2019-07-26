package com.liu.mapper;

import java.util.List;

import com.liu.po.ViewInfo;

public interface ViewInfoMapper {
    int deleteByPrimaryKey(Integer viewId);

    int insert(ViewInfo record);

    int insertSelective(ViewInfo record);

    ViewInfo selectByPrimaryKey(Integer viewId);

    int updateByPrimaryKeySelective(ViewInfo record);

    int updateByPrimaryKey(ViewInfo record);
    
    public List<ViewInfo> getViewInfoList(ViewInfo record);
}