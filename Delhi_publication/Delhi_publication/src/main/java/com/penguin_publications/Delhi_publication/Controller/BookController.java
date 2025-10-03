package com.penguin_publications.Delhi_publication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Delhi_publication.Entity.Book;
import com.penguin_publications.Delhi_publication.Service.BookService;

@RestController
public class BookController {

	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/add-book")
	public Book addbookcontroller(@RequestBody Book book) throws Exception
	{
		
		return service.addbook(book);
	}
}
