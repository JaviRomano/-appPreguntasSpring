package com.dam.appPreguntas.app.entity;

import jakarta.persistence.Entity;

@Entity
public class TrueFalseQuestion extends Question {
	
	private long id;	
	private String text;
	private Boolean correctAnswer;
	
	
	@Override
	public boolean validateAnswer(String answer) {
		if (answer == null) return false;
		return Boolean.parseBoolean(answer).equals(correctAnswer);
	}

	public Boolean getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Boolean correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
}
