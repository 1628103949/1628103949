package com.zy.demo.controller;

import static org.mockito.Matchers.intThat;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.demo.bean.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {
	
	@RequestMapping("show")
	public String show(Model model) throws Exception{
		model.addAttribute("str", "hello spring boot freemarker");
		Student s = new Student();
		s.setId(1002);
		s.setName("张三");
		model.addAttribute("stu", s);
		
		java.util.List<Student> students = new ArrayList<>();
		for(int i = 0 ; i < 3; i++){
			Student stu = new Student();
			stu.setId(i);
			stu.setName("stu" + i);
			students.add(stu);
		}
		model.addAttribute("students", students);
		if(!"a".equals("")){
			throw new RuntimeException("运行时异常！");
		}	
		return "show";
	}
	
}
