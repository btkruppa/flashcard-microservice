package com.revature.flashcard.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.FlashCard;

@Repository
public interface FlashcardRepo extends JpaRepository<FlashCard, Integer> {
	
}
