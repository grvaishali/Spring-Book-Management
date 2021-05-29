package com.library.bookmanagement.facade.mapper;

import org.springframework.stereotype.Component;

import com.library.bookmanagement.domain.Author;
import com.library.bookmanagement.facade.dto.AuthorDTO;

@Component
public class AuthorMapper {

	public AuthorDTO map(Author author) {
		AuthorDTO authorDTO = new AuthorDTO();
		authorDTO.setFirstname(author.getFirstname());
		authorDTO.setLastname(author.getLastname());
		return authorDTO;
	}
}
