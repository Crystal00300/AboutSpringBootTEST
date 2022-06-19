package com.amme.ammedemo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student,Integer>{
	@Modifying
	@Query(value="DELETE FROM Student WHERE number=:number2")
	public void deleteStudentByNumber(@Param("number2")Integer number);
	
}
