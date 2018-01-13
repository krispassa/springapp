package com.maatic.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maatic.Student;

@Controller
public class WelcomeController {
	
	
	@Autowired
	private Student student;
	
	@RequestMapping("/")
	public String getHi(Model model)
	{
		//model.put("student", this.populateStudent());
		model.addAttribute("student", this.populateStudent());
	
		return "welcome";
	}
	public Student populateStudent() {
		
		student.setFname("JOHN");
		student.setLname("DOE");
		student.setStudentid("123");
		return student;
	}

}
