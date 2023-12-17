package com.dcs.exception;

import org.springframework.http.HttpStatus;

public class DeveloperCommunitySystemException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeveloperCommunitySystemException(String str) {
		super(str);
	}
	public DeveloperCommunitySystemException(String str, HttpStatus internalServerError) {
		// TODO Auto-generated constructor stub
		super(str);
	}

	public DeveloperCommunitySystemException(HttpStatus internalServerError) {
		// TODO Auto-generated constructor stub
		super();
	}

	
}
