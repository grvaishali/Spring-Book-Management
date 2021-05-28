package com.library.bookmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.bookmanagement.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
