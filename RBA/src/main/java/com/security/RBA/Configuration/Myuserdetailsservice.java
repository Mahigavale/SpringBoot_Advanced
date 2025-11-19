package com.security.RBA.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.RBA.Entity.UserEntity;
import com.security.RBA.Repository.Userrepo;

@Component
public class Myuserdetailsservice implements UserDetailsService{
 
	
	@Autowired
	private Userrepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	 UserEntity user=repo.loadbyusername(username);
		return new Userprincipal(user);
	}

}
