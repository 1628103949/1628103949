package com.qfedu.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.qfedu.mybatis.pojo.Blog;

public interface BlogMapper {

	/* CRUD */
	Blog selectBlog(Integer id);
	
	Blog selectBlog2(Integer id);
	
	List<Blog> selectBlogByTitle(String title);
	
	List<Blog> selectBlogByTitle2(String title);
	
	List<Blog> selectBlogBySort(String column);
	
	List<Blog> selectBlogByPage(int offset, int pagesize);
	
	List<Blog> selectBlogByPage2(
			@Param(value="offset") int offset, 
			@Param(value="pagesize") int pagesize);
	
	List<Blog> selectBlogByPage3(Map<String, Object> map);
	
	
	int insertBlog(Blog blog);
	
	int insertBlogMysql(Blog blog);
	
	int upadteBlog(Blog blog);
	
	int deleteBlogById(Integer id);
	
	/*动态sql*/
	List<Blog> selectActiveBlogByTitle(Blog blog);
	
	List<Blog> selectActiveBlogByTitleOrStyle(Blog blog);
	
	List<Blog> selectBlogByCondition(Blog blog);
	
	int upadteBlogByCondition(Blog blog);
	
	List<Blog> selectBlogByConditionTrim(Blog blog);
	
	int upadteBlogByConditionTrim(Blog blog);
	
	int deleteBlogList(List<Integer> ids);
	
	
	
	
}
