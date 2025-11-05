package com.profiles.SpringProfiles.Controller;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.SpringProfiles.Entity.Student;
import com.profiles.SpringProfiles.Exceptions.GreaterException;
import com.profiles.SpringProfiles.Exceptions.StudentExists;
import com.profiles.SpringProfiles.Repository.StudentRepo;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo repo;

	List<Integer> list=new ArrayList<Integer>();
	
	@PostMapping("/add")
	public ResponseEntity<?> addstudent( @RequestHeader int header,@Valid @RequestBody Student student) 
	{
		
		if( !list.contains(header))
		{
			list.add(header);
			if(student.getId()==25)
			{
				throw new StudentExists("Student is already present..");
			}
			else if(student.getId()>30)
			{
				throw new GreaterException("too old");
			}
			repo.save(student);
			return ResponseEntity.status(HttpStatus.CREATED).body(300);
		}
		
		else
		{
			throw new SameRequestException("same request");
		}
		
	}
	
	
	
	 
}


