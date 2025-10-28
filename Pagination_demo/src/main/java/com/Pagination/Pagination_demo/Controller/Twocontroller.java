package com.Pagination.Pagination_demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Pagination.Pagination_demo.Entity.Two;
import com.Pagination.Pagination_demo.Repository.Tworepo;

@RestController
public class Twocontroller {

	
	 @Autowired
	 private Tworepo repo;
	
//	 @GetMapping("/get-allt")
//	public List<Two> getalltwo()
//	{
//		return repo.findAll();
//	}
//	 
//	 public int addt(@RequestBody)
}
