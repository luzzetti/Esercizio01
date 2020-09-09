package it.luzzetti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.luzzetti.entity.Animale;
import it.luzzetti.service.AnimaliService;

@Controller
@RequestMapping("/animali")
public class AnimaliController {

	@Autowired
	AnimaliService animaliService;
	
	@GetMapping("/")
	public String getListaAnimali(Model model) {
		model.addAttribute("listaAnimali", animaliService.leggiAnimali());
		return "animali/lista-animali";
	}

	@GetMapping("/new")
	public String nuovoAnimaleDaAdottare() {
		return "animali/nuovo-animale";
	}
	
	@PostMapping("/")
	public String creaAnimaleDaAdottare(Animale animale) {
		animaliService.creaAnimale(animale);
		return "redirect:/animali/";
	}
	
	
	

	
}
