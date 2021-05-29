package com.library.bookmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.library.bookmanagement.facade.BookFacade;
import com.library.bookmanagement.repositories.BookRepository;

@Controller
public class BookController {

	@Autowired
	private final BookFacade bookFacade;

	public BookController(BookFacade bookFacade) {
		this.bookFacade = bookFacade;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookFacade.getBooks());
		return "books/list";
	}
}
