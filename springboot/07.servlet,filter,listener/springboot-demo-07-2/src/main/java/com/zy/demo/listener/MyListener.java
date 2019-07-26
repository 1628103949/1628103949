package com.zy.demo.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.catalina.SessionEvent;
import org.apache.catalina.SessionListener;

public class MyListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("MyListener sessionCreated...");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		
	}

	

}
