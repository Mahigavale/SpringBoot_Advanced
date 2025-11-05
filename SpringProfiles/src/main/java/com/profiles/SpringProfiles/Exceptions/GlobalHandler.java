package com.profiles.SpringProfiles.Exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalHandler {

	/**
	 * 
	 * 
	 */

	@ExceptionHandler(StudentExists.class)
	public  ResponseEntity<Map<String , String>> handleit(StudentExists ex)
	{
		
		Map<String, String> mp=new HashMap();
		
		mp.put("conflict", ex.getMessage());
		return ResponseEntity.status(HttpStatus.CONFLICT).body(mp);
	}
	
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<Map<String, String>> handleit(HttpRequestMethodNotSupportedException ex)
	{
		Map<String ,String> mp=new HashMap<String, String>();
		
		mp.put("Reason", ex.getMessage());
		
		
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(mp);
	}
	
	
	
	
	
	@ExceptionHandler(GreaterException.class)
	public ResponseEntity<Errorres> handl(GreaterException ex)
	{
		Errorres er=new Errorres();
		
		er.setMessage(ex.getMessage());
		er.setStatuscode(403);
		er.setDate(LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(er);
	}
	
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handlevalid(MethodArgumentNotValidException ex)
	{
		Map<String, String> mp=new HashMap<String, String>();
		
		ex.getBindingResult().getFieldErrors().stream().forEach((e)->{
			mp.put(e.getField(), e.getDefaultMessage());
		});		
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mp);
	}
	@ExceptionHandler(SameRequestException.class)
	public Map<String, String> h2(SameRequestException ex)
	{
		Map<String , String> mp=new HashMap<String, String>();
		
		mp.put("Same Req:", ex.getMessage());
		
		return mp;
	}
}

class SameRequestException extends RuntimeException
{
	 public SameRequestException(String str)
	 {super(str);
		 
	 }
}