package it.luzzetti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/animali")
public class AnimaliController {

	@GetMapping("/")
	public String getListaAnimali() {
		//
		return "lista-animali";
	}

	@GetMapping("/new")
	public String nuovoAnimaleDaAdottare() {
		return null;
	}
	
	@PostMapping("/")
	public String creaAnimaleDaAdottare() {
		return null;
	}
	
	
	

	
}
