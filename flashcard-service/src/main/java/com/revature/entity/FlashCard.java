package com.revature.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlashCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	private String question;

	@Column(nullable = false)
	private String answer;

	@Column(nullable = false)
	private int creatorId;

	@Column(nullable = false)
	private boolean isPublic = false;

	@Column(nullable = false)
	private int studySetId;

	@Column(nullable = false)
	private boolean mastered = false;

	@Column(nullable = false)
	private LocalDateTime lastUpdated;

	public FlashCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlashCard(long id, String question, String answer, int creatorId, boolean isPublic, int studySetId,
			boolean mastered, LocalDateTime lastUpdated) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.creatorId = creatorId;
		this.isPublic = isPublic;
		this.studySetId = studySetId;
		this.mastered = mastered;
		this.lastUpdated = lastUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public int getStudySetId() {
		return studySetId;
	}

	public void setStudySetId(int studySetId) {
		this.studySetId = studySetId;
	}

	public boolean isMastered() {
		return mastered;
	}

	public void setMastered(boolean mastered) {
		this.mastered = mastered;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + creatorId;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (isPublic ? 1231 : 1237);
		result = prime * result + ((lastUpdated == null) ? 0 : lastUpdated.hashCode());
		result = prime * result + (mastered ? 1231 : 1237);
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		result = prime * result + studySetId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FlashCard other = (FlashCard) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (creatorId != other.creatorId)
			return false;
		if (id != other.id)
			return false;
		if (isPublic != other.isPublic)
			return false;
		if (lastUpdated == null) {
			if (other.lastUpdated != null)
				return false;
		} else if (!lastUpdated.equals(other.lastUpdated))
			return false;
		if (mastered != other.mastered)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (studySetId != other.studySetId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", question=" + question + ", answer=" + answer + ", creatorId=" + creatorId
				+ ", isPublic=" + isPublic + ", studySetId=" + studySetId + ", mastered=" + mastered + ", lastUpdated="
				+ lastUpdated + "]";
	}

}
