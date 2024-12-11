package com.dam.appPreguntas.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	
	@GetMapping("/quiz/question")
	public String questionPage(Model model) {
		model.addAttribute("titulo", "Pregunta");
		return "question";
	}	

}
