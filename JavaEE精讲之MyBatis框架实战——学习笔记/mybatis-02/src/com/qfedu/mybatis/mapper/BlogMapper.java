package com.qfedu.mybatis.mapper;

import java.util.List;

import com.qfedu.mybatis.pojo.Blog;

public interface BlogMapper {

	Blog selectBlogById(Integer id);
	
	List<Blog> selectBlogList();
	
	List<Blog> selectBlogListNested();
	
	Blog selectBlogByIdConstructor(Integer id);
}
