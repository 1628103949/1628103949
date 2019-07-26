package com.qfedu.mybatis.mapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.qfedu.mybatis.pojo.Blog;
import com.qfedu.mybatis.util.MyBatisUtil;

public class BlogMapperTest {
	
	@Test 
	public void testSelectBlogNoInterface() {
		SqlSession session = MyBatisUtil.getSqlSession();
		
		Blog blog = (Blog) session.selectOne(
				"com.qfedu.mybatis.mapper.BlogMapper.selectBlog", 1);
		
		session.close();
		
		System.out.println(blog);
	}

	@Test
	public void testSelectBlog() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		Blog blog = blogMapper.selectBlog(1);
		
		session.close();
		
		System.out.println(blog);
	}
	
	@Test
	public void testSelectBlog2() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		Blog blog = blogMapper.selectBlog2(1);
		
		session.close();
		
		System.out.println(blog);
	}
	
	@Test
	public void testSelectBlogByTitle() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogByTitle("%o%");
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogByTitle2() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		//List<Blog> blogList = blogMapper.selectBlogByTitle2("%o%");
		List<Blog> blogList = blogMapper.selectBlogByTitle2("m");
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogBySort() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogBySort("title");
		/*List<Blog> blogList = blogMapper.selectBlogBySort("CONVERT(title USING gbk)");*/
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogByPage() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogByPage(2, 2);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogByPage2() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		List<Blog> blogList = blogMapper.selectBlogByPage2(2, 2);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectBlogByPage3() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("offset", 2);
		map.put("pagesize", 2);
		List<Blog> blogList = blogMapper.selectBlogByPage3(map);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testInsertBlog() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		int count = blogMapper.insertBlog(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("插入了" + count + "条记录");
	}
	
	@Test
	public void testInsertBlogMysql() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		int count = blogMapper.insertBlogMysql(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("插入了" + count + "条记录");
	}
	
	@Test
	public void testUpdateBlog() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(1);
		blog.setTitle("我的Blog");
		blog.setStyle("black");
		blog.setState("NOT ACTIVE");
		blog.setFeatured(false);
		blog.setAuthorId(2);
		
		int count = blogMapper.upadteBlog(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("修改了" + count + "条记录");
	}
	
	@Test
	public void testUpdateBlog2() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		
		Blog blog = blogMapper.selectBlog(1);	
		//Blog blog = new Blog();
		blog.setId(1);
		blog.setTitle("我的Blog");
		blog.setAuthorId(3);
		
		int count = blogMapper.upadteBlog(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("修改了" + count + "条记录");
	}
	
	@Test
	public void testDeleteBlogById() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		int count = blogMapper.deleteBlogById(35);
		
		session.commit();
		session.close();
		
		System.out.println("删除了" + count + "条记录");
	}
	
	@Test
	public void testSelectActiveBlogByTitle() {
		
		//TODO
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		//blog.setTitle("%o%");
		//blog.setTitle(null);
		blog.setTitle("");
		List<Blog> blogList = blogMapper.selectActiveBlogByTitle(blog);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testSelectActiveBlogByTitleOrStyle() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		//blog.setTitle("%o%");
		//blog.setTitle(null);
		blog.setTitle("");
		//blog.setStyle("black");
		List<Blog> blogList = blogMapper.selectActiveBlogByTitleOrStyle(blog);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	
	@Test
	public void testSelectBlogByCondition() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setState("ACTIVE");
		blog.setTitle("%o%");
		List<Blog> blogList = blogMapper.selectBlogByCondition(blog);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testUpdateBlogByCondition() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(1);
		//blog.setTitle("我的Bloggggggg");
		blog.setStyle("yellow");
		
		int count = blogMapper.upadteBlogByCondition(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("修改了" + count + "条记录");
	}
	
	
	@Test
	public void testSelectBlogByConditionTrim() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setTitle("%o%");
		List<Blog> blogList = blogMapper.selectBlogByConditionTrim(blog);
		
		session.close();
		
		System.out.println(blogList);
	}
	
	@Test
	public void testUpdateBlogByConditionTrim() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(1);
		blog.setTitle("我的Bloggggggg");
		//blog.setStyle("yellow");
		
		int count = blogMapper.upadteBlogByConditionTrim(blog);
		
		session.commit();
		session.close();
		
		System.out.println(blog);
		System.out.println("修改了" + count + "条记录");
	}
	
	@Test
	public void testDeleteBlogList() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		List<Integer> ids = Arrays.asList(32,33,34);
		int count = blogMapper.deleteBlogList(ids);
		
		session.commit();
		session.close();
		
		System.out.println("删除了" + count + "条记录");
	}
	
	/**
	 * 测试一级缓存
	 */
	@Test
	public void testSelectBlogCacheLevelOne1() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog1 = blogMapper.selectBlog(1);
		System.out.println("结果已查询");
		
		Blog blog2 = blogMapper.selectBlog(1);
		System.out.println("结果已查询：从缓存中获取数据");
		
		session.close();
		
		System.out.println("session关闭");
	}
	
	/**
	 * 测试一级缓存
	 */
	@Test
	public void testSelectBlogCacheLevelOne2() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper = session.getMapper(BlogMapper.class);
		
		Blog blog1 = blogMapper.selectBlog(1);
		System.out.println("结果已查询");
		
		blog1.setFeatured(true);
		blogMapper.upadteBlog(blog1);
		System.out.println("刷新缓存");
		
		Blog blog2 = blogMapper.selectBlog(1);
		System.out.println("重新执行查询");
		
		session.commit();
		session.close();
		
		System.out.println("session关闭");
	}
	
	/**
	 * 测试二级缓存
	 */
	@Test
	public void testSelectBlogCacheLevelTwo1() {
		
		SqlSession session1 = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper1 = session1.getMapper(BlogMapper.class);
		
		Blog blog1 = blogMapper1.selectBlog(1);
		System.out.println("结果已查询");
		
		
		/*blog1.setFeatured(true);
		blogMapper1.upadteBlog(blog1);
		System.out.println("刷新缓存");
		
		session1.commit();*/
		session1.close();
		
		
		SqlSession session2 = MyBatisUtil.getSqlSession();
		BlogMapper blogMapper2 = session2.getMapper(BlogMapper.class);
		
		Blog blog2 = blogMapper2.selectBlog(1);
		System.out.println("结果已查询。缓存被刷新，所以重新查询");
		session2.close();
		
		System.out.println("session关闭");
	}
}
