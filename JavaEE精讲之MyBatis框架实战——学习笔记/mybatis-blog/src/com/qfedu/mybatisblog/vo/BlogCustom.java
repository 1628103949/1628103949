package com.qfedu.mybatisblog.vo;

import com.qfedu.mybatisblog.pojo.Blog;

public class BlogCustom extends Blog{

	private static final long serialVersionUID = 1L;
	
	private String authorUsername;

	public String getAuthorUsername() {
		return authorUsername;
	}

	public void setAuthorUsername(String authorUsername) {
		this.authorUsername = authorUsername;
	}
	
	
}
