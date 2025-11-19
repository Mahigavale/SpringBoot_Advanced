package com.security.RBA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.RBA.Entity.UserEntity;
import com.security.RBA.Repository.Userrepo;

@Service
public class UserService {

	

	
	@Autowired
	private Userrepo repo;
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(5);
	
	
	public UserEntity adduser(UserEntity user)
	{
	  UserEntity ent=new UserEntity();
	  
	  ent.setUsername(user.getUsername());
	  ent.setPassword( encoder.encode(user.getPassword()));
	  
	  return repo.save(ent);
	}
	
	public List<UserEntity> getalls()
	{
		return repo.findAll();
	}
}
