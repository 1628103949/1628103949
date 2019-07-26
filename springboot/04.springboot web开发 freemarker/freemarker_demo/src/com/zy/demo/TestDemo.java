package com.zy.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zy.demo.bean.Person;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class TestDemo {
	public static void main(String[] args) throws IOException, TemplateException {
		//配置对象
		Configuration conf = new Configuration();		
		//模板的路径
		File dir = new File("D:\\workspace_springboot_screencapture\\freemarker_demo\\ftl\\");		
		//从路径中导入template.html
		conf.setDirectoryForTemplateLoading(dir);
		//获取模板
		Template template = conf.getTemplate("template.html");
		
		//数据根节点
		Map<String, Object> root = new HashMap<>();
		root.put("hello", "hello freemarker");
		
		//对象数据
		Person person = new Person();
		person.setId(10001);
		person.setName("xxx");
		root.put("p", person);
		
		//对象集合
		List<Person> ps = new ArrayList<>();
		for(int i = 0 ; i < 3; i++){
			Person p = new Person();
			p.setId(i);
			p.setName("p" + i);
			ps.add(p);
		}
		root.put("ps", ps);
		
		//输出流
		Writer out = new FileWriter(new File("d:\\hello.html"));
		//生成静态页面
		template.process(root, out);
		out.flush();
		out.close();
		System.out.println("生成成功");
	}
}
