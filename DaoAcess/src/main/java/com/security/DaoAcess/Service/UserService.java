package com.security.DaoAcess.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.DaoAcess.Entity.UserEntity;
import com.security.DaoAcess.Repo.UserRepo;

@Service
public class UserService implements UserServiceInterface {

	
	@Autowired
	private UserRepo repo;
	
	
	public UserEntity addUser(UserEntity entity)
	{
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(5);
		
		UserEntity user=new UserEntity();
		user.setUserEmail(entity.getUserEmail());
		user.setUserId(entity.getUserId());
		user.setUserPassword(encoder.encode(entity.getUserPassword()));
		user.setUserName(entity.getUserName());
		 user.setUserRoles(entity.getUserRoles());
		return repo.save(user);
		
	}
	
	public List<UserEntity> getallusers()
	{
		return repo.findAll();
	}
}
