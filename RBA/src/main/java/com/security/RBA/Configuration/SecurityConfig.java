package com.security.RBA.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	/**
	 * This class is the root now for: Security.
	 * @throws Exception 
	 */
	
	@Autowired
	private Myuserdetailsservice userdetailss;
	
	
	@Bean
	public SecurityFilterChain mysecurity(HttpSecurity http) throws Exception
	{
	     http.csrf()
	     .disable()
	    .authorizeHttpRequests()
	    .requestMatchers(HttpMethod.POST).permitAll()
	    .anyRequest().authenticated()
	    .and()
	    .httpBasic()
	     ;
	    return http.build();
	}
	
//	@Bean
//	public UserDetailsService getuser()
//	{ 
//		UserDetails  user_1=User.builder().username("Tejal").password("{noop}Tejal@123").build();
//		
//		UserDetails  user_2=User.builder().username("Sejal").password("{noop}Sejal@123").build();
//
//		
//		return new InMemoryUserDetailsManager(user_1,user_2);
//		
//	}
	
	@Bean
	public AuthenticationProvider myauth()
	{
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(5);
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		
		provider.setPasswordEncoder(encoder);
		provider.setUserDetailsService(userdetailss);
		
		return provider;
	}
	
	
//	@Bean
//	public PasswordEncoder myencoder()
//	{
//		BCryptPasswordEncoder bt=new BCryptPasswordEncoder(5);
//		return bt;
//	}
}
