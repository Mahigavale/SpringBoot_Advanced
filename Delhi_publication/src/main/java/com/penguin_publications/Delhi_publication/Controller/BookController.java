package com.penguin_publications.Delhi_publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

import jakarta.validation.Valid;


@RequestMapping("/book-controller")
@RestController
@CrossOrigin(allowedHeaders = "http://localhost:5173/")
public class BookController {

	
	@Autowired
	private BookService service;
	
	
	@PostMapping("/add-book")
	public Book addbookcontroller( @Valid @RequestBody Book book) throws Exception
	{
		
		
		return service.addbook(book);
	}
	
	@GetMapping("/get-all-books")
	public Page<Book> getall(@RequestParam int pagenumber,@RequestParam  int pagesize,
			@RequestParam String sortre, @RequestParam String order
			) throws Exception
	{
		
		
		//throw  new Exception("hurray");
		
		/**
		 * A)
		 * Pageable pageable=PageRequest.OfSize(int size) => default page number =>0
		 */
		
		/**
		 * B)
		 * Pageable pagebale=PageRequest.of(pagenumber, pagesize);
		 * you can get the pagenumber and pagesize from the User.
		 */
		
		/**
		 * C) filter / sort the data by my own choice.
		 */
		
		String str2=order.toLowerCase();
		if(str2.equals("asc"))
		{
			Sort sort2=Sort.by(sortre).ascending();
			//System.out.println(PageRequest.of(pagenumber, pagesize, sort2));
			return service.getall(PageRequest.of(pagenumber, pagesize, sort2));
		}
		
		else
		{
			
			Sort sort=Sort.by(sortre).descending();
			return service.getall(PageRequest.of(pagenumber, pagesize, sort));
		}
		
		
	}
	
	
	
	
}
