package com.penguin_publications.Delhi_publication.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.penguin_publications.Delhi_publication.Entity.Author;
import com.penguin_publications.Delhi_publication.Repository.AuthorRepo;

@Service
public class AuthorService {
	
	
	
	AuthorRepo repo;
	
	public AuthorService( AuthorRepo repo)
	{
		this.repo=repo;
		
	}
	
	
	
	
	public Author addauthor(Author author) throws Exception
	{
		
		if(author==null)
		{
			throw  new Exception ("can't be null");
		}
		   return  repo.save(author);
		   
	}
	
	public List<Author> getall() throws Exception{
		
		if(  !repo.findAll().isEmpty())
		{
			return repo.findAll();
		}
		throw new Exception ("Something went wrong ");
	}

}
