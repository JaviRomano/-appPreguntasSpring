package com.dam.appPreguntas.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Value("Pagina inicial")
	private String titulo;
	@Value("examen recuperación 1ª evaluacion")
	private String info;

	@GetMapping({ "/home", "/", "" })
	public String home(Model model) {
		model.addAttribute("titulo", titulo);
		model.addAttribute("info", info);

		return "home";
	}

}
