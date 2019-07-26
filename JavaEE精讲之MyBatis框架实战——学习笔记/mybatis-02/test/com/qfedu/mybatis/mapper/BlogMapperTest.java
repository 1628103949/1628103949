package com.qfedu.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.qfedu.mybatis.pojo.Blog;
import com.qfedu.mybatis.util.MyBatisUtil;

public class BlogMapperTest {

	@Test
	public void testSelectBlog() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		Blog blog = blogMapper.selectBlogById(1);
		
		session.close();
		
		System.out.println(blog);
	}
	
	@Test
	public void testSelectBlogList() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogList();
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogListNested() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogListNested();
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogByIdConstructor() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		Blog blog = blogMapper.selectBlogByIdConstructor(1);
		
		session.close();
		
		System.out.println(blog);
	}
	
	/**
	 * 测试延迟加载
	 */
	@Test
	public void testSelectBlogByIdLazyLoading() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		System.out.println("查询blog");
		Blog blog = blogMapper.selectBlogById(1);
		session.close();
		
		System.out.println("查询blog的title属性");
		System.out.println(blog.getTitle());
		System.out.println("查询blog的author属性");
		System.out.println(blog.getAuthor().getUsername());
		System.out.println("查询结束");
	}
	
	
}
