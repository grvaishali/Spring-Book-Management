package com.library.bookmanagement.facade.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.library.bookmanagement.domain.Author;
import com.library.bookmanagement.facade.AuthorFacade;
import com.library.bookmanagement.facade.dto.AuthorDTO;
import com.library.bookmanagement.facade.mapper.AuthorMapper;
import com.library.bookmanagement.service.AuthorService;

@Component
public class DefaultAuthorFacade implements AuthorFacade {

	private final AuthorService authorService;
	private final AuthorMapper authorMapper;

	public DefaultAuthorFacade(@Autowired AuthorService authorService) {
		this.authorMapper = new AuthorMapper();
		this.authorService = authorService;
	}

	@Override
	public Collection<AuthorDTO> getAuthors() {
		Collection<Author> authors = authorService.getAuthors();
		if (authors != null) {
			return authors.stream().map(author -> authorMapper.map(author)).collect(Collectors.toList());
		} else {
			return Collections.EMPTY_LIST;
		}
	}
}
