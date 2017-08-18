package com.studentmgr.common.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -7796502366163043439L;
	
	public static final String SERVICE_FAILED = "SERVICE_FAILED";
    public static final String DATA_ACCESS_FAILED = "DATA_ACCESS_FAILED";
    
	public ServiceException(Exception exception) {
		super(exception);
	}
    
	public ServiceException(String message, Exception exception) {
		super(message, exception);
	}
	
	public ServiceException(String message) {
		super(message);
	}
	
}