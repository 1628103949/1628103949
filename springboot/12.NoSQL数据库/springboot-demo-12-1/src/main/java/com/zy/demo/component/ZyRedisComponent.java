package com.zy.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class ZyRedisComponent {
	
	@Autowired
	private StringRedisTemplate template;
	
	public void set(String key,String value){
		ValueOperations<String, String> ops = this.template.opsForValue();
		if(!this.template.hasKey(key)){
			ops.set(key, value);
		}else{
			System.out.println("this key = " + ops.get(key));
		}
	}
	
	public String get(String key){
		return template.opsForValue().get(key);
	}
	
	public void delete(String key){
		this.template.delete(key);
	}
}
