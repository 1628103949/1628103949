package com.zy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringbootDemo14Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo14Application.class, args);
	}
}
