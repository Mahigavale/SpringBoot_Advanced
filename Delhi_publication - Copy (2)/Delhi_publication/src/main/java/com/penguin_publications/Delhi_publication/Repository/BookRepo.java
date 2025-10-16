package com.penguin_publications.Delhi_publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penguin_publications.Delhi_publication.Entity.Book;

@Repository
public interface BookRepo  extends  JpaRepository<Book,Integer>{

}
