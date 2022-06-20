package com.amme.ammedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amme.ammedemo.model.Student;
import com.amme.ammedemo.model.StudentDao;

@RestController
public class StudentControllerApi {
	
	@Autowired
	private StudentDao dao;
	
	@GetMapping("findAllStudent")
	public List<Student> findAllStudent() {
		List<Student> studentList = dao.findAll();
		return studentList;
	}
	
	

}
