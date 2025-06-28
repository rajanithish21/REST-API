package com.jsp.Student1.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MobileAlreadyExistsException extends RuntimeException {
	
	String message = "Mobile Already Exists";

}
