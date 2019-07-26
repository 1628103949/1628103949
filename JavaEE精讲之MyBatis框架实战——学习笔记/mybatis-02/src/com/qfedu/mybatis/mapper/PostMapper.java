package com.qfedu.mybatis.mapper;

import com.qfedu.mybatis.pojo.Post;

public interface PostMapper {

	Post selectPostById(Integer id);
}
