package com.security.DaoAcess.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.apache.juli.FileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.security.DaoAcess.Entity.UserEntity;
import com.security.DaoAcess.Service.MailsenderService;
import com.security.DaoAcess.Service.UserService;

import jakarta.mail.MessagingException;

@RestController
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	@Autowired
	private MailsenderService service2;
	
	
	@PostMapping("/add-user")
	public UserEntity adduser(@RequestBody UserEntity entity) throws MessagingException
	{
	
		service2.htmlmail(entity.getUserEmail(), entity.getUserName());
		
		List<String> roles=entity.getUserRoles();
		roles.stream().forEach(i->System.out.println(i));
		return service.addUser(entity);
	}
	

	@GetMapping("/get-users")
	public List<UserEntity> getall()
	{
		return service.getallusers();
	}

	
	@PostMapping("/upload-file")
     public long getfile(@RequestParam("file2") MultipartFile file2) throws IOException
     {
		
		 
		return file2.getSize();
     }
}
