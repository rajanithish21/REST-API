package com.jsp.Student1.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.jsp.Student1.dto.StudentDto;
import com.jsp.Student1.model.Student;
import com.jsp.Student1.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@RequestBody StudentDto dto){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.saveStudent(dto));
	}
	
	@PostMapping("/students")
	public ResponseEntity<Object> savestudents(@RequestBody List<StudentDto> dto){
		return ResponseEntity.status(HttpStatus.OK).body(service.saveStudents(dto));
				
	}
	
	


}