package com.library.bookmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.bookmanagement.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
