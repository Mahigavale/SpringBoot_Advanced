package com.security.RBA.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.RBA.Entity.UserEntity;
import com.security.RBA.Service.UserService;

@RestController
public class Carcontroller {
	
	
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/add-user")
	public UserEntity add(@RequestBody UserEntity entity)
	{
		return service.adduser(entity);
	}
	
	@GetMapping("/get-user")
	public List<UserEntity> getall()
	{
		return service.getalls();
	}
}
