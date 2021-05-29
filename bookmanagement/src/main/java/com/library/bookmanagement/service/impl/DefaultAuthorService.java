package com.library.bookmanagement.service.impl;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.bookmanagement.domain.Author;
import com.library.bookmanagement.repositories.AuthorRepository;
import com.library.bookmanagement.service.AuthorService;
import com.library.bookmanagement.util.CollectionUtil;

@Service
public class DefaultAuthorService implements AuthorService {

	private final AuthorRepository authorRepository;

	public DefaultAuthorService(@Autowired AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	public Collection<Author> getAuthors() {
		Collection<Author> authorsList = null;
		Iterable<Author> authors = authorRepository.findAll();
		
		if (authors != null) {
			authorsList = CollectionUtil.getCollectionFromIteralbe(authors);
		}

		return authorsList!=null ? authorsList : Collections.EMPTY_LIST;
	}

}
