package com.library.bookmanagement.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.library.bookmanagement.domain.Author;
import com.library.bookmanagement.domain.Book;
import com.library.bookmanagement.domain.Publisher;
import com.library.bookmanagement.repositories.AuthorRepository;
import com.library.bookmanagement.repositories.BookRepository;
import com.library.bookmanagement.repositories.PublisherRepository;

@Component
public class BootstrapClass implements CommandLineRunner {

	AuthorRepository authorRepository;
	BookRepository bookRepository;
	PublisherRepository publisherRepository;

	public BootstrapClass(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Bootstrap started");

		Publisher publisher = new Publisher();
		publisher.setName("abc");
		publisher.setAddressLine1("123 Kanata");
		publisher.setCity("ottawa");
		publisher.setState("Ontario");
		publisherRepository.save(publisher);

		System.out.println(publisher);
		System.out.println("Publisher count " + publisherRepository.count());

		Author author1 = new Author("Eric", "evan");
		Book book1 = new Book("Happy days", "123456");
		author1.getBook().add(book1);
		book1.getAuthor().add(author1);
		book1.setPublisher(publisher);
		publisher.getBooks().add(book1);

		authorRepository.save(author1);
		bookRepository.save(book1);
		publisherRepository.save(publisher);

		Author author2 = new Author("Red", "Johnson");
		Book book2 = new Book("Spring", "234567");
		author2.getBook().add(book2);
		book2.getAuthor().add(author2);
		book2.setPublisher(publisher);
		publisher.getBooks().add(book2);


		authorRepository.save(author2);
		bookRepository.save(book2);
		publisherRepository.save(publisher);

		System.out.println("Number of books.. " + bookRepository.count());
		System.out.println("Number of publisher books " + publisher.getBooks().size());

	}

}
