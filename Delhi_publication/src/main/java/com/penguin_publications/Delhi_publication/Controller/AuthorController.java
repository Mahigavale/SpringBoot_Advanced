package com.penguin_publications.Delhi_publication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penguin_publications.Delhi_publication.Entity.Author;
import com.penguin_publications.Delhi_publication.Service.AuthorService;

@RequestMapping("/author-controller")
@RestController
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
	public List<Author> getall() throws Exception
	{
		
		return service.getall();
	}
}
