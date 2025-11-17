package com.security.DaoAcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.DaoAcess.Entity.UserEntity;
import com.security.DaoAcess.Service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	
	
	@PostMapping("/add-user")
	public UserEntity adduser(@RequestBody UserEntity entity)
	{
	
		return service.addUser(entity);
	}
	
	
	@GetMapping("/get-users")
	public List<UserEntity> getall()
	{
		return service.getallusers();
	}

}
