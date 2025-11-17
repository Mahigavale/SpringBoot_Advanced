package com.security.DaoAcess.Service;

import java.util.List;

import com.security.DaoAcess.Entity.UserEntity;

public interface UserServiceInterface {

	public UserEntity addUser(UserEntity entity);
	
	public List<UserEntity> getallusers();
}
