package com.library.bookmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.bookmanagement.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(final String email);

}
