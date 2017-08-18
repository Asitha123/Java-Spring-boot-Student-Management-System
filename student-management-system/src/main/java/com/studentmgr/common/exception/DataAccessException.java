package com.studentmgr.common.exception;

public class DataAccessException extends Exception{

	private static final long serialVersionUID = -8983030260917870356L;

	public DataAccessException(Exception exception) {
		super(exception);
	}
	
	public DataAccessException(String message) {
		super(message);
	}
}
