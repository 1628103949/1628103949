package com.zy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.zy.demo.filter.MyFilter1;
import com.zy.demo.filter.MyFilter2;
import com.zy.demo.listener.MyListener;
import com.zy.demo.servlet.MyServlet1;
import com.zy.demo.servlet.MyServlet2;

@SpringBootApplication
public class SpringbootDemo041Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo041Application.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServlet1(){
		return new ServletRegistrationBean(new MyServlet1(), "/my1");
	}
	
	@Bean
	public ServletRegistrationBean getServlet2(){
		return new ServletRegistrationBean(new MyServlet2(), "/my2");
	}
	
	@Bean
	public FilterRegistrationBean getFilter1(){
		return new FilterRegistrationBean(new MyFilter1(), getServlet1(),getServlet2());
	}
	
	@Bean
	public FilterRegistrationBean getFilter2(){
		return new FilterRegistrationBean(new MyFilter2(), getServlet1(),getServlet2()); 
	}
	
	@Bean
	public ServletListenerRegistrationBean<MyListener> getListener(){
		return new ServletListenerRegistrationBean<>(new MyListener());
	}
}
