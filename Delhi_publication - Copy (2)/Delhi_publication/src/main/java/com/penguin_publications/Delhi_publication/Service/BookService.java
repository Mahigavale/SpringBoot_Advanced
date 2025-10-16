package com.penguin_publications.Delhi_publication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penguin_publications.Delhi_publication.Entity.Book;
import com.penguin_publications.Delhi_publication.Repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo repo;
	
	
	
	public Book addbook(Book book) throws Exception
	{
		
		if(book==null)
		{
			throw new Exception("book can't be null");
		}
		System.out.println("recieved book :"+book.getName());
		System.out.println("savinggggg.....");
	    Book book_saved=repo.save(book);
	    System.out.println("book saved......");
	    
	    return  book_saved;
	}  

}
