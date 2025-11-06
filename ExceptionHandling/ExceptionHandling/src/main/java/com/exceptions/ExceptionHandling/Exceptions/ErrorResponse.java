package com.exceptions.ExceptionHandling.Exceptions;

import java.time.LocalDateTime;

public class ErrorResponse {

	
	
	String message;
	
	int code;
	
	LocalDateTime time;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
}
