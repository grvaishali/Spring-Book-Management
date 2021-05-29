package com.library.bookmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.bookmanagement.domain.Book;
import com.library.bookmanagement.repositories.BookRepository;

@RestController
@RequestMapping("**/api")
public class BookRestController {

	@Autowired
	BookRepository bookRepository;

	@GetMapping("/books")
	public ResponseEntity<Iterable<Book>> getBooks() {
		return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
	}
}