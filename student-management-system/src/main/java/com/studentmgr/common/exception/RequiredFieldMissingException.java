package com.studentmgr.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST)  //400
public class RequiredFieldMissingException extends RuntimeException {

	private static final long serialVersionUID = 3582955683863543348L;
	
	public RequiredFieldMissingException(Object... fields) {
		super(String.format("Required Field Missing [%s]", fields));
	}

}
