package com.jsp.Student1.model;

import com.jsp.Student1.dto.StudentDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

	@Id
	@GeneratedValue(generator = "id")
	@SequenceGenerator(initialValue = 101001, allocationSize = 1, name = "id")
	private Long id;
	
	private String name;
	
	private Long mobile;
	
	private Integer maths;
	
	private Integer science;
	
	private Integer english;
	
	private Double percentage;
	
	public Student(StudentDto dto) {
		this.name = dto.getName();
		this.mobile = dto.getMobile();
		this.english = dto.getEnglish();
		this.maths = dto.getMaths();
		this.science = dto.getScience();
		this.percentage = (dto.getMaths() + dto.getScience() + dto.getEnglish()) /3.0;
	}
	
	
	
	
	

}
