package com.qfedu.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.qfedu.mybatis.pojo.Post;
import com.qfedu.mybatis.util.MyBatisUtil;

public class PostMapperTest {

	@Test
	public void testSelectPost() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		PostMapper postMapper = session.getMapper(PostMapper.class);
		Post post = postMapper.selectPostById(1);
		
		session.close();
		
		System.out.println(post);
	}
	
}
