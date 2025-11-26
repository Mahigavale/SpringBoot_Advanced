package com.security.DaoAcess.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
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
	public SecurityFilterChain mysecurity(HttpSecurity http) throws Exception
	{
		
	        http
	            // 1. ENABLE CORS Integration
	            // This tells Spring Security to look for and use the global 
	            // CorsConfigurationSource bean (like the CorsConfig class below).
	            .cors(Customizer.withDefaults()) 

	            // 2. Disable CSRF for API endpoints
	            .csrf(csrf -> csrf.disable())

	            // 3. Authorization Rules
	            .authorizeHttpRequests(authorize -> authorize
	                // CRITICAL FIX: Allow all OPTIONS requests (the CORS preflight)
	                // These requests must bypass security checks.
	                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() 
	                
	                // Your existing rules
	                .requestMatchers(HttpMethod.POST).permitAll()
	                .requestMatchers(HttpMethod.GET).hasAnyRole("ADMIN", "USER")
	                
	                // All other requests require authentication
	                .anyRequest().authenticated()
	            )
	            
	            // 4. Use HTTP Basic authentication
	            .httpBasic(Customizer.withDefaults());

	        return http.build();
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
