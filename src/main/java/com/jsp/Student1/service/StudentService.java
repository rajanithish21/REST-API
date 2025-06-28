package com.jsp.Student1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Student1.dto.StudentDto;
import com.jsp.Student1.exception.MobileAlreadyExistsException;
import com.jsp.Student1.model.Student;
import com.jsp.Student1.repository.StudentRepository;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student saveStudent(StudentDto dto) {
		if(!studentRepository.existsByMobile(dto.getMobile())) {
			Student student = new Student(dto);
			studentRepository.save(student);
			return student;
		}else {
			throw new MobileAlreadyExistsException("Mobile Already Exists:"+dto.getMobile());
		}
		
	}

	public Object saveStudents(List<StudentDto> dto) {
		List<Student>students = new ArrayList<Student>();
		
		for(StudentDto studentDto : dto) {
			if(studentRepository.existsByMobile(studentDto.getMobile())) 
				throw new MobileAlreadyExistsException("Mobile Number Already Exists:" + studentDto.getMobile());
				else 
					students.add(new Student(studentDto));
				}
			
		return studentRepository.saveAll(students);
		}
		
	}

	

	

	


