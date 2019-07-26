package com.qfedu.mybatis.pojo;

import java.io.Serializable;
import java.util.List;

public class Tag implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private List<Post> postList;
	
	public Tag() {
		
		System.out.println("Tag�޲ι��췽��");
	}
	
	public Tag(Integer id, String name) {
		System.out.println("Tag�вι��췽��");
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setId");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}
	public List<Post> getPostList() {
		return postList;
	}
	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}
	
}
