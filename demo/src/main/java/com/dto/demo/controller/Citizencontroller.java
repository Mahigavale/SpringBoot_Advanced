package com.dto.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.demo.DTO.CombineDto;
import com.dto.demo.entity.Aadhar;
import com.dto.demo.entity.Citizen;
import com.dto.demo.repository.Aadharrepo;
import com.dto.demo.repository.Citizenrepo;

@RestController
public class Citizencontroller {

	
	@Autowired
	private Citizenrepo repo;
	
	
	@Autowired
	private Aadharrepo repo2;
	
	
	@PostMapping("/add-citizen")
	public Citizen add(@RequestBody Citizen citizen)
	{
		return repo.save(citizen);
}
	
	@GetMapping("/get-citizen")
	public List<CombineDto> getall()
	{
		List<Citizen> list= repo.findAll();
	    return  list.stream().map(Citizencontroller::converter2).collect(Collectors.toList());

	}
	
	@GetMapping("/get-aadhar")
	public List<CombineDto> getad()
	{
	 List<Aadhar>list=repo2.findAll();
	 
	    return  list.stream().map(Citizencontroller::converter).collect(Collectors.toList());
	}
	
	
	
	public static  CombineDto  converter(Aadhar aadhar )
	{
		CombineDto dto=new CombineDto();
		
		dto.setAnumber(aadhar.getAnumber());
		dto.setCname(aadhar.getCitizen().getCname());
		
		return dto;
	}
	
	public static CombineDto converter2(Citizen citizen)
	{
       CombineDto dto=new CombineDto();
		
		dto.setAnumber(citizen.getAadhar().getAnumber());
		dto.setCname(citizen.getCname());
		
		return dto;
	
	}
}
