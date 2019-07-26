package com.zy.demo;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.devtools.remote.server.Dispatcher;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.zy.demo.filter.MyFilter1;
import com.zy.demo.filter.MyFilter2;
import com.zy.demo.listener.MyListener;
import com.zy.demo.servlet.MyServlet1;
import com.zy.demo.servlet.MyServlet2;

@SpringBootApplication
public class SpringbootDemo041Application implements ServletContextInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo041Application.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.addServlet("m1", MyServlet1.class).addMapping("/my1");
		servletContext.addListener(MyListener.class);
		servletContext.addFilter("f1", MyFilter1.class)
		.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
	}
	
	
}
