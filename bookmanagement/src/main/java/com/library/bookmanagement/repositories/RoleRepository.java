package com.library.bookmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import com.library.bookmanagement.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByRole(final String role);
}
