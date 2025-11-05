package com.profiles.SpringProfiles.Exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Errorres {

	int statuscode;
	String message;
	
	LocalDateTime date;

	public int getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime localDateTime) {
		this.date = localDateTime;
	}
}
