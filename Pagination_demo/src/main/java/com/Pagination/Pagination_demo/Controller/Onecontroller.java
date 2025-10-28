package com.Pagination.Pagination_demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Pagination.Pagination_demo.Entity.One;
import com.Pagination.Pagination_demo.Repository.Onerepo;

@RestController
public class Onecontroller {

	
	@Autowired
	private Onerepo repo;
	
	@GetMapping("/get-ao")
	public List<One> getallone()
	{
		 return repo.findAll();
	}
}
