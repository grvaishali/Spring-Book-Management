package com.library.bookmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.bookmanagement.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
