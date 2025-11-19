package com.security.DaoAcess.Config;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
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
		
        
		
		return entity.getUserRoles().stream()
				.map(SimpleGrantedAuthority::new).toList();
                     
                     
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
