package com.security.RBA.Configuration;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.security.RBA.Entity.UserEntity;


public class Userprincipal implements UserDetails {

	
	private UserEntity entity;
	
	
	public Userprincipal(UserEntity entity)
	{
		this.entity=entity;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
		
		return entity.getPassword();
	}

	@Override
	public String getUsername() {
		
		return entity.getUsername();
	}

}
