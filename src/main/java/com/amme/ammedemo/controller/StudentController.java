package com.amme.ammedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amme.ammedemo.model.Student;
import com.amme.ammedemo.model.StudentDao;
import com.amme.ammedemo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentDao dao;

	@PostMapping("addStundent")
	public String addStudent(@RequestParam("name") String name, @RequestParam("number") Integer number,
			@RequestParam("gender") String gender) {
		Student student = new Student();
		student.setName(name);
		student.setNumber(number);
		student.setGender(gender);
		dao.save(student);
		return "index";
	}
	


}
