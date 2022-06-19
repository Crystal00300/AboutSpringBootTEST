package com.amme.ammedemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amme.ammedemo.model.Student;
import com.amme.ammedemo.model.StudentDao;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public void save(Student student) {
		studentDao.save(student);
	}
}
