package com.exceptions.ExceptionHandling.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.ExceptionHandling.Entity.Car;
import com.exceptions.ExceptionHandling.Exceptions.ExpensiveCarException;
import com.exceptions.ExceptionHandling.Exceptions.NameShortException;
import com.exceptions.ExceptionHandling.Repo.Carrepo;

import jakarta.validation.Valid;

@RestController
public class CarController {
	
	
	@Autowired
	private Carrepo repo;

	
	
	@PostMapping("/add-car")
	public String addcar( @Valid @RequestBody Car car) throws ExpensiveCarException 
	{
		
		return "added car:";
	}
	
	
	
	
}
