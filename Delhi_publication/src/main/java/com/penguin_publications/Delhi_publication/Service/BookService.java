package com.penguin_publications.Delhi_publication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	public Page<Book> getall(Pageable pageable )
	{
		/**
		 * Pageable=>Data.domain.
		 * Pageable  instance=> repository methods. ex.findAll();
		 * take the limited data set out of the total data.
		 */
		return repo.findAll(pageable);
		
		/** 
		 * Only two books per page are returned.
		 * 
		 */
	}

}
