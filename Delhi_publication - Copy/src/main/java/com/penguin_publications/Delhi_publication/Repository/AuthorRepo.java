package com.penguin_publications.Delhi_publication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.penguin_publications.Delhi_publication.Entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
