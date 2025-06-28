package com.jsp.Student1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Student1.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	boolean existsByMobile(Long mobile);

}
