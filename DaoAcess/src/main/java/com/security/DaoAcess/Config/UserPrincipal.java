package com.security.DaoAcess.Config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.DaoAcess.Entity.UserEntity;

public class UserPrincipal implements UserDetails {

	private UserEntity entity;
	
	public UserPrincipal(UserEntity entity)
	{
		this.entity=entity;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
		
		return entity.getUserPassword();
	}

	@Override
	public String getUsername() {
		return entity.getUserName();
	}

}
