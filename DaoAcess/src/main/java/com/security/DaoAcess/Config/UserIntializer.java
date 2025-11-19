package com.security.DaoAcess.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.security.DaoAcess.Entity.UserEntity;
import com.security.DaoAcess.Repo.UserRepo;

@Component
public class UserIntializer implements CommandLineRunner{

	
	@Autowired
	UserRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		if(repo.count()==0) {
		
			System.out.println("ADDING THE DEFAULT USER....");
		UserEntity user1=new UserEntity();
		
		user1.setUserName("ABC");
		user1.setUserPassword(new BCryptPasswordEncoder(5).encode("ABC@123"));
		user1.setUserEmail(null);
		
		List<String> roles=new ArrayList<String>();
		roles.add("ROLE_USER");
		roles.add("ROLE_ADMIN");
		user1.setUserRoles(roles);
		
		repo.save(user1);
		
		System.out.println("User added...");
		
		}
		else
		{
			System.out.println("The Default user is present in the repo..skipping intialization");
		}
		
		
	}

}
