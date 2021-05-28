package com.library.bookmanagement.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Automatically generate id with an underlying databse
	private Long id;
	
	private String title;
	private String isbn;
	
	@ManyToMany
	@JoinTable(name = "author_book", joinColumns= @JoinColumn(name = "book_id"),
	inverseJoinColumns = @JoinColumn(name = "author_id"))
	private Set<Author> authors;

	public Book() {
	}

	public Book(String title, String isbn, Set<Author> author) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<Author> getAuthor() {
		return authors;
	}

	public void setAuthor(Set<Author> author) {
		this.authors = author;
	}
}
