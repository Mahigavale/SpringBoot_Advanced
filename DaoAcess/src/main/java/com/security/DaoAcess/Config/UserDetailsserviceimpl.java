package com.security.DaoAcess.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.DaoAcess.Entity.UserEntity;
import com.security.DaoAcess.Repo.UserRepo;
@Component
public class UserDetailsserviceimpl implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		  
		UserEntity userent=  repo.loadbyname(username);
		
		return new UserPrincipal(userent);
		/**
		 * USerPrincipal IS-A UserDetails
		 */
	} 

}
