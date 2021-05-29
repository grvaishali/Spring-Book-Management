package com.library.bookmanagement.service.impl;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bookmanagement.domain.Book;
import com.library.bookmanagement.repositories.BookRepository;
import com.library.bookmanagement.service.BookService;
import com.library.bookmanagement.util.CollectionUtil;

@Service
public class DefaultBookService implements BookService {

	private final BookRepository bookRepository;

	public DefaultBookService(@Autowired BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Collection<Book> getBooks() {
		Collection<Book> booksList = null;
		Iterable<Book> books = bookRepository.findAll();

		if (books != null) {
			booksList = CollectionUtil.getCollectionFromIteralbe(books);
		}

		return booksList != null ? booksList : Collections.EMPTY_LIST;
	}
}
