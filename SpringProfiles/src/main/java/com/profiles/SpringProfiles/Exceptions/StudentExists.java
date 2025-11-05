package com.profiles.SpringProfiles.Exceptions;

public class StudentExists extends RuntimeException {

	
	public StudentExists(String str)
	{
		super(str);
	}
}
