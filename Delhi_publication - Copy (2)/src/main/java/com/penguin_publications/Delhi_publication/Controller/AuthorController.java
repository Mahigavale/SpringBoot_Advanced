package com.penguin_publications.Delhi_publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Delhi_publication.Entity.Author;

import com.penguin_publications.Delhi_publication.Service.AuthorService;

@RequestMapping("/author-controller")
@RestController
@CrossOrigin(allowedHeaders ="*")
public class AuthorController {

	
	
	AuthorService service;
	
	
	public AuthorController(AuthorService service)
	{
                   this.service=service;
	}
		
	@PostMapping("/add-author")
	public Author add(@RequestBody Author author) throws Exception
	{
		
		System.out.println(author.getAuthorName());
		return service.addauthor(author);
	}
	
	@GetMapping("/get-all-authors")
	public Page<Author> getall( @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size,
            @RequestParam(defaultValue = "authorName") String sortBy,
            @RequestParam(defaultValue = "true") boolean descending) throws Exception
	{
		Sort sort = descending ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page, size, sort);
        //return productService.findAll(pageable);
		
		return service.getall(pageable);
	}
	
	
}



