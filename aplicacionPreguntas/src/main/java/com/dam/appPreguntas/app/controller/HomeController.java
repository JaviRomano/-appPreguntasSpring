package com.dam.appPreguntas.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Value("Programa Quiz")
	private String titulo;
	@Value("Menu inicial")
	private String info;

	@GetMapping({ "/home", "/", "" })
	public String home(Model model) {
		model.addAttribute("titulo", titulo);
		model.addAttribute("info", info);

		return "home";
	}

}
