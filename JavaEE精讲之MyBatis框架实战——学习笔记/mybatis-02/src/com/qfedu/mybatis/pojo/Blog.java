package com.qfedu.mybatis.pojo;

import java.io.Serializable;

public class Blog implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	/*private Integer authorId;*/
	private Author author;
	private String state;
	private Boolean featured;
	private String style;
	
	public Blog() {
		super();
		/*this.title = "未命名";
		this.authorId = 1;
		this.state = "NOT ACTIVE";
		this.featured = false;
		this.style = "red";*/
	}
	
	public Blog(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
		System.out.println("构造方法调用。。。。。。");
	}


	public Integer getId() {
		//System.out.println("get id...");
		return id;
	}
	public void setId(Integer id) {
		//System.out.println("set id...");
		this.id = id;
	}
	public String getTitle() {
		//System.out.println("get title...");
		return title;
	}
	public void setTitle(String title) {
		//System.out.println("set title...");
		this.title = title;
	}
	/*public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}*/
	
	public String getState() {
		//System.out.println("get state...");
		return state;
	}
	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		//System.out.println("set author...");
		this.author = author;
	}


	public void setState(String state) {
		//System.out.println("set state...");
		this.state = state;
	}
	public Boolean getFeatured() {
		//System.out.println("get featured...");
		return featured;
	}
	public void setFeatured(Boolean featured) {
		//System.out.println("set featured...");
		this.featured = featured;
	}
	public String getStyle() {
		//System.out.println("get style...");
		return style;
	}
	public void setStyle(String style) {
		//System.out.println("set style...");
		this.style = style;
	}


	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author + ", state=" + state + ", featured="
				+ featured + ", style=" + style + "]";
	}
	
}
