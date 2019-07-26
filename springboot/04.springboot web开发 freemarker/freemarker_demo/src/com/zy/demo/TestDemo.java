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
		//���ö���
		Configuration conf = new Configuration();		
		//ģ���·��
		File dir = new File("D:\\workspace_springboot_screencapture\\freemarker_demo\\ftl\\");		
		//��·���е���template.html
		conf.setDirectoryForTemplateLoading(dir);
		//��ȡģ��
		Template template = conf.getTemplate("template.html");
		
		//���ݸ��ڵ�
		Map<String, Object> root = new HashMap<>();
		root.put("hello", "hello freemarker");
		
		//��������
		Person person = new Person();
		person.setId(10001);
		person.setName("xxx");
		root.put("p", person);
		
		//���󼯺�
		List<Person> ps = new ArrayList<>();
		for(int i = 0 ; i < 3; i++){
			Person p = new Person();
			p.setId(i);
			p.setName("p" + i);
			ps.add(p);
		}
		root.put("ps", ps);
		
		//�����
		Writer out = new FileWriter(new File("d:\\hello.html"));
		//���ɾ�̬ҳ��
		template.process(root, out);
		out.flush();
		out.close();
		System.out.println("���ɳɹ�");
	}
}
