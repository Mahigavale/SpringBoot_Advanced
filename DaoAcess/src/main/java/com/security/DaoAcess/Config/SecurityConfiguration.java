package com.security.DaoAcess.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	
	@Autowired
	private UserDetailsserviceimpl myuserdetailsserivce;
	
	@Bean
	public SecurityFilterChain mysecurity(HttpSecurity security) throws Exception
	{
		security.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers(HttpMethod.POST).hasRole("ADMIN")
		.requestMatchers(HttpMethod.GET).hasAnyRole("ADMIN", "USER")  //ROLE_ADMIN
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
		return security.build();
	}
	
	
//	@Bean
//	public AuthenticationProvider mysecuritys()
//	{
//		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
//		
//		provider.setPasswordEncoder(new BCryptPasswordEncoder(5));
//		provider.setUserDetailsService(myuserdetailsserivce);
//		
//		return provider;
//	}
	
	@Bean
	public PasswordEncoder mypassword()
	{
		return new BCryptPasswordEncoder(5);
	}

	
	
}
