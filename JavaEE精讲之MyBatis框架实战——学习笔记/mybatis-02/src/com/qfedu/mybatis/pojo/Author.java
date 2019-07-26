package com.qfedu.mybatis.pojo;

import java.util.List;

public class Author {

	private Integer id;
	private String username;
	private String password;
	private String email;
	private String bio;
	private String favouriteSection;
	private String nickname;
	private String realname;
	/*private List<Post> posts;
	private Blog blog;*/
	
	public Author() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getFavouriteSection() {
		return favouriteSection;
	}
	public void setFavouriteSection(String favouriteSection) {
		this.favouriteSection = favouriteSection;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	/*public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}*/

	@Override
	public String toString() {
		return "Author [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", bio="
				+ bio + ", favouriteSection=" + favouriteSection + ", nickname=" + nickname + ", realname=" + realname
				+ "]";
	}
	
	
}
