package com.zy.demo.util.base;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

public abstract class AbstractJdbcDao {
	
	@Autowired
	protected JdbcTemplate template;
	
	/**
	 * 获取当前事务最后一次更新的主键值
	 * @return
	 */
	public Long getLastId(){
		return template.queryForObject("select last_insert_id() as id", Long.class);
	}
	
	/**
	 * 查询对象信息
	 * @return 
	 */
	public <T> T queryForObject(String sql,Class<T> clazz,Object... args){
		Assert.hasText(sql,"sql语句不能为空");
		return template.queryForObject(sql, new BeanPropertyRowMapper<T>(clazz),args);
	}
	
	/**
	 * 查询对象集合
	 * @param sql
	 * @param clazz
	 * @param args
	 * @return
	 */
	public <T> List<T> queryForObjectList(String sql,Class<T> clazz,Object... args){
		Assert.hasText(sql,"sql语句不能为空");
		return template.query(sql, args,new BeanPropertyRowMapper<T>(clazz));
	}
	
	/**
	 * 分页查询
	 * @param sql
	 * @param pageCurrent
	 * @param pageSize
	 * @param args
	 * @return
	 */
	public Page<Map<String, Object>> queryForPage(String sql,int pageCurrent,int pageSize,Object... args){
		Assert.hasText(sql,"sql语句不能为空");
		Assert.isTrue(pageCurrent >= 1, "pageCurrent必须大于等于1");
		String sqlCount = Sql.countSql(sql);//select count(*) from ...
		int count = template.queryForObject(sqlCount, Integer.class,args);//【条件查询下的】总记录数
		pageCurrent = Sql.checkPageCurrent(count, pageSize, pageCurrent);//当前页
		pageSize = Sql.checkPageSize(pageSize);//每页显示的记录数
		int totalPage = Sql.countTotalPage(count, pageSize);//【条件查询下的】总页数
		String sqlList = sql + Sql.limitSql(count, pageCurrent, pageSize);
		List<Map<String, Object>> list = template.queryForList(sqlList,args);
		return new Page<Map<String,Object>>(count,totalPage,pageCurrent,pageSize,list);
	}
	
	public <T> Page<T> queryForPage(String sql,int pageCurrent,int pageSize,Class<T> clazz,Object... args){
		Assert.hasText(sql,"sql语句不能为空");
		Assert.isTrue(pageCurrent >= 1, "pageCurrent必须大于等于1");
		Assert.isTrue(clazz != null, "clazz不能为空");
		String sqlCount = Sql.countSql(sql);//select count(*) from ...
		int count = template.queryForObject(sqlCount, Integer.class,args);//【条件查询下的】总记录数
		pageCurrent = Sql.checkPageCurrent(count, pageSize, pageCurrent);//当前页
		pageSize = Sql.checkPageSize(pageSize);//每页显示的记录数
		int totalPage = Sql.countTotalPage(count, pageSize);//【条件查询下的】总页数
		String sqlList = sql + Sql.limitSql(count, pageCurrent, pageSize);
		List<T> list = template.query(sqlList, new BeanPropertyRowMapper<T>(clazz),args);
		return new Page<T>(count,totalPage,pageCurrent,pageSize,list);	
	}
	
}
