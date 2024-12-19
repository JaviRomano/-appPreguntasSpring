package com.dam.appPreguntas.app.entity;

public class MultipleChoiceQuestion extends Question{
	
	private String correctAnswer;
	private 

	@Override
	public boolean validateAnswer(String answer) {
		return false;
	}

}
