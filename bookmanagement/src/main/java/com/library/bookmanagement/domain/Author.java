package com.library.bookmanagement.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Automatically generate id with an underlying databse
	private Long id;
	
	private String firstname;
	private String lastname;
	
	@ManyToMany(mappedBy = "authors")
	private Set<Book> book;

	public Author() {
	}

	public Author(String firstname, String lastname, Set<Book> book) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.book = book;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

}
