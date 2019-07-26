package com.qfedu.mybatisblog.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.qfedu.mybatisblog.pojo.Blog;
import com.qfedu.mybatisblog.pojo.BlogExample;
import com.qfedu.mybatisblog.util.MyBatisUtil;
import com.qfedu.mybatisblog.vo.BlogCustom;

public class BlogMapperTest {

	
	@Test
	public void testDelete() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		int count = blogMapper.deleteByPrimaryKey(31);
		session.commit();
		session.close();
		
		System.out.println("删除了" + count + "条记录");
		
	}
	
	@Test
	public void testSelect() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		Blog blog = blogMapper.selectByPrimaryKey(1);
		session.close();
		
		System.out.println(blog);
		
	}
	
	@Test
	public void testInsert() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setTitle("helen's blog");
		blog.setAuthorId(1);
		int count = blogMapper.insert(blog);
		session.commit();
		session.close();
		
		System.out.println("添加了" + count + "条记录");
		
	}
	
	@Test
	public void testUpdate() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(29);
		blog.setTitle("helen's blog");
		blog.setAuthorId(1);
		int count = blogMapper.updateByPrimaryKey(blog);
		session.commit();
		session.close();
		
		System.out.println("修改了" + count + "条记录");
		
	}
	
	@Test
	public void testUpdateSelective() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(28);
		blog.setTitle("helen's blog");
		blog.setAuthorId(1);
		int count = blogMapper.updateByPrimaryKeySelective(blog);
		session.commit();
		session.close();
		
		System.out.println("修改了" + count + "条记录");
		
	}
	
	
	@Test
	public void testSelectByExample() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		BlogExample blogExample = new BlogExample();
		BlogExample.Criteria blogCriteria = blogExample.createCriteria();
		blogCriteria.andTitleLike("%o%");
		
		List<Blog> blogList = blogMapper.selectByExample(blogExample);
		session.close();
		
		System.out.println(blogList);
		
	}
	
	@Test
	public void testSelectBlogCustom() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapperCustom blogMapper = session.getMapper(BlogMapperCustom.class);
		
		BlogCustom blog = blogMapper.selectBlogById(1);
		session.close();
		
		System.out.println(blog);
		
	}
	
	
	
}
