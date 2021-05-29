package com.library.bookmanagement.facade;

import java.util.Collection;

import com.library.bookmanagement.facade.dto.BookDTO;

public interface BookFacade {

	Collection<BookDTO> getBooks();

}
