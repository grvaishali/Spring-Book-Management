package com.library.bookmanagement.facade.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.bookmanagement.domain.Book;
import com.library.bookmanagement.facade.BookFacade;
import com.library.bookmanagement.facade.dto.BookDTO;
import com.library.bookmanagement.facade.mapper.BookMapper;
import com.library.bookmanagement.service.BookService;

@Component
public class DefaultBookFacade implements BookFacade {

	private final BookService bookService;
	private final BookMapper bookMapper;

	public DefaultBookFacade(@Autowired BookService bookService) {
		this.bookMapper = new BookMapper();
		this.bookService = bookService;
	}

	@Override
	public Collection<BookDTO> getBooks() {
		Collection<Book> books = bookService.getBooks();
		if (books != null) {
			return books.stream().map(book -> bookMapper.map(book)).collect(Collectors.toList());
		} else {
			return Collections.EMPTY_LIST;
		}
	}
}
