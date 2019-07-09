package com.liu.mapper;

import com.liu.po.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userNumber);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userNumber);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> getUserList(UserInfo record);
}