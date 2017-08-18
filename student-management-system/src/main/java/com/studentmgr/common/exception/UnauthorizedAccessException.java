package com.studentmgr.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.UNAUTHORIZED)  //400
public class UnauthorizedAccessException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -878810853364598782L;

	public UnauthorizedAccessException() {
	}
	
	public UnauthorizedAccessException(String message) {
		super(message);
	}
}
