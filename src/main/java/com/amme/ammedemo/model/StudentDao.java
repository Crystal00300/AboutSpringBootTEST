package com.amme.ammedemo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

public interface StudentDao extends JpaRepository<Student,Integer>{
	
}
