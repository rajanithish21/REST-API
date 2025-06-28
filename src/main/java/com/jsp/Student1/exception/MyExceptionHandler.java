package com.jsp.Student1.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {
	
	@ExceptionHandler(MobileAlreadyExistsException.class)
	public ResponseEntity<HashMap<String, String>> handle(MobileAlreadyExistsException exception){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("message", exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}

}
