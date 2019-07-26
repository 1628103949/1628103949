package com.zy.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zy.demo.bean.UserInfo;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer>{
	
	@Query(value="select u from UserInfo u where u.name like ?1")
	public List<UserInfo> findByName(String name);//名字优于配置
	public List<UserInfo> findByNameAndSex(String name,String sex);
	public List<UserInfo> findByNameLike(String name);//模糊查询
	public Page<UserInfo> findByNameLike(String name,Pageable pageable);//模糊查询加分页
	
	@Cacheable(cacheNames="zy",key="#p0")
	public UserInfo findById(Integer id);
	
	@CachePut(cacheNames="zy",key="#p0.id")
	public UserInfo save(UserInfo userInfo);
}
