package com.revature.flashcard.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.FlashCard;
import com.revature.flashcard.repos.FlashcardRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("flashcards")
public class FlashCardController {
	protected Logger logger = Logger.getLogger(FlashCardController.class.getName());

	@Autowired
	private FlashcardRepo fr;

	@RequestMapping
	public List<FlashCard> findAll() {
		List<FlashCard> cards = fr.findAll();
		System.out.println(cards);
		return cards;
	}

}
