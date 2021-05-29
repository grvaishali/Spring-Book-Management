package com.library.bookmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.library.bookmanagement.facade.AuthorFacade;
import com.library.bookmanagement.repositories.AuthorRepository;

@Controller
public class AuthorController {

	@Autowired
	private final AuthorFacade authorFacade;

	public AuthorController(AuthorFacade authorFacade) {
		this.authorFacade = authorFacade;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorFacade.getAuthors());
		return "authors/list";
	}
}
