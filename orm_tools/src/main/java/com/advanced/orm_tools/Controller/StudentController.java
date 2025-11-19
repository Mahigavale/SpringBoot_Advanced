package com.advanced.orm_tools.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanced.orm_tools.Entity.Student;
import com.advanced.orm_tools.Repository.StudentRepository;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/student")
@RestController
@Slf4j
public class StudentController {
	
	
	
	
	@Autowired
	private StudentRepository studentrepo;
	
	
	@PostMapping("/add-student")
	public ResponseEntity<String> addStudent(@Valid @RequestBody Student student)
	{
		
		if(student !=null)
		{
			studentrepo.save(student);
			return ResponseEntity.ok("student added");
		}
		return ResponseEntity.badRequest().body("something went wrong");
	}

}
