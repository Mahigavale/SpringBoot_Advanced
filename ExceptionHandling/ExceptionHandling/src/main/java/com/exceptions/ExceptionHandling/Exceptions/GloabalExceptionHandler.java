package com.exceptions.ExceptionHandling.Exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GloabalExceptionHandler {
	
	@ExceptionHandler(ExpensiveCarException.class)
	public  ResponseEntity<Map<String, String>> handleex(ExpensiveCarException ex)
	{
		Map<String, String> mp=new HashMap<String, String>();
		
		mp.put("Expensive exception:", ex.getMessage());
		
		
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mp);
	}
	
	
	@ExceptionHandler(NameShortException.class)
	public ResponseEntity<ErrorResponse> handle2(NameShortException ex)
	{
		Map<String, String> mp=new HashMap<String, String>();
		
		ErrorResponse er=new ErrorResponse();
//		mp.put("Name Short:", ex.getMessage());
//		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(mp);
//		
		
		er.setMessage(ex.getMessage());
		er.setTime(LocalDateTime.now());
		er.setCode(403);
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(er);
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public  ResponseEntity<Map<String, String>> getvalidexceptions(MethodArgumentNotValidException ex)
	{
		Map<String, String> mp=new HashMap<String, String>();
		
		
		ex.getBindingResult().getFieldErrors().stream().peek((e)->{
			System.out.println(e.getField());
			System.out.println(e.getDefaultMessage());
			System.out.println("*************");
		}).forEach((e)->{
			mp.put(e.getField(), e.getDefaultMessage());
		});
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(mp);
	}
	

}
