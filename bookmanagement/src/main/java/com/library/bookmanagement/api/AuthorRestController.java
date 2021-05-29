package com.library.bookmanagement.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.bookmanagement.domain.Author;
import com.library.bookmanagement.repositories.AuthorRepository;

@RestController
@RequestMapping("**/api")
public class AuthorRestController {
	
	@Autowired
	AuthorRepository authorRepository;
	
	public ResponseEntity<Iterable<Author>> getAuthors(){
		return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);

	}

}
