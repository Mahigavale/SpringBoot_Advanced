package com.advanced.orm_tools.Controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanced.orm_tools.Entity.Courses;
import com.advanced.orm_tools.Repository.CourseRepository;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("/Course")
@RestController
@Slf4j
public class CourseController {

	
	@Autowired
	private CourseRepository courserepo;
	
	
	
	@PostMapping("/addcourse")
	public ResponseEntity<String> addcourse(@Valid @RequestBody Courses courses)
	{
	   // log.info("Adding new course: {}", courses.getCourseName());
		courserepo.save(courses);
		
		
		return ResponseEntity.ok("coursed added successfully....!");
	}
}
