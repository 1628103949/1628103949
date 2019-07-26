package com.zy.redis.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class TestDemo {
	public static void main(String[] args) {
		Jedis j = new Jedis("localhost");
		System.out.println(j.ping());
		
//		j.set("str", "hello world");
//		String value = j.get("str");
//		System.out.println("value = " + value);
		
//		Map<String, String> map = new HashMap<>();
//		map.put("a", "1");
//		map.put("b", "2");
//		j.hmset("map", map);
//		map = j.hgetAll("map");
//		System.out.println(map.get("b"));
		
		j.lpush("li", "a","b","c");
		List<String> list = j.lrange("li", 0, 100);
		for(String s : list){
			System.out.println("s = " + s);
		}
		
	}
}
