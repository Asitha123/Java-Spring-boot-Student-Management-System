package com.studentmgr.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)  //404
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -2217466109027636423L;

	public ResourceNotFoundException() {
	}
	
	public ResourceNotFoundException(String message){
		super(message);
	}
}
