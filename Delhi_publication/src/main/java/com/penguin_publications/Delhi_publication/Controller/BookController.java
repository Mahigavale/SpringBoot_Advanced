package com.penguin_publications.Delhi_publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Delhi_publication.Entity.Book;
import com.penguin_publications.Delhi_publication.Service.BookService;


@RequestMapping("/book-controller")
@RestController
@CrossOrigin(allowedHeaders ="*")
public class BookController {

	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/add-book")
	public Book addbookcontroller(@RequestBody Book book) throws Exception
	{
		
		return service.addbook(book);
	}
	
	@GetMapping("/get-all-books")
	public List<Book> getall()
	{
		return service.getall();
	}
	
	
	
	
}
