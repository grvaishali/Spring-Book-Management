package com.library.bookmanagement.facade;

import java.util.Collection;

import com.library.bookmanagement.facade.dto.AuthorDTO;

public interface AuthorFacade {

	Collection<AuthorDTO> getAuthors();
}
