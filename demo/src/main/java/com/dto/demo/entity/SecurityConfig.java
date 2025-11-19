package com.dto.demo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	
	//webconfigureradapter.
	
	//AntMatchers()
	
	
	@Bean
	public SecurityFilterChain Security(HttpSecurity http) throws Exception
	{
		http
	    .csrf(csrf -> csrf.disable()) 
	    .authorizeHttpRequests(auth -> auth
	      
	        .requestMatchers(HttpMethod.POST, "/public/**").hasAnyRole("USER", "ADMIN")
	        
	      
	        .requestMatchers("/actoradmin/**").hasRole("ADMIN") 
	        
	       
	        .anyRequest().authenticated()
	    )
	    .httpBasic(Customizer.withDefaults()); 
		
		return http.build();
		
	}
	
	
	/**
	 * USerDetailsService, => DB => Fetch  => LoadUSerbyname()
	 * USerDetails, => User Info => for authorization =>
	 * USer => Actual USer
	 */
	

	
	@Bean
	public UserDetailsService users()
	{
		 UserDetails user_1=User.builder().username("AJIT")
				 .password("{noop}Ajit@123")
				 .roles("ADMIN","USER")
				 .build();
		 
		 UserDetails user_2=User.builder().username("Prasad")
				 .password("{noop}P@123")
				 .roles("USER")
				 .build();
		 return new InMemoryUserDetailsManager(user_1, user_2);
	}
}
