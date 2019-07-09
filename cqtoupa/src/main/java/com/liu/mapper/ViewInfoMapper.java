package com.liu.mapper;

import com.liu.po.ViewInfo;

import java.util.List;

public interface ViewInfoMapper {
    int deleteByPrimaryKey(Integer viewId);

    int insert(ViewInfo record);

    int insertSelective(ViewInfo record);

    ViewInfo selectByPrimaryKey(Integer viewId);

    int updateByPrimaryKeySelective(ViewInfo record);

    int updateByPrimaryKey(ViewInfo record);

    List<ViewInfo> getViewInfoList(ViewInfo info);
}