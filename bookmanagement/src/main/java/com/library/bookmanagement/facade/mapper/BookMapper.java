package com.library.bookmanagement.facade.mapper;

import org.springframework.stereotype.Component;

import com.library.bookmanagement.domain.Book;
import com.library.bookmanagement.facade.dto.BookDTO;

@Component
public class BookMapper {

	public BookDTO map(Book book) {
		BookDTO bookDTO = new BookDTO();
		bookDTO.setId(book.getId());
		bookDTO.setIsbn(book.getIsbn());
		bookDTO.setPublisher(book.getPublisher());
		bookDTO.setTitle(book.getTitle());
		return bookDTO;
	}
}
