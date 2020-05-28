package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SalutiController {

	 // mappato url: ha il compito di proiettare il nostro model con la view, e di
	// intercettare l'imput ricevuti dalla vista e riportarli sul model.
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView model= new ModelAndView();
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping("/mio profilo")
	public ModelAndView unSaluto() {
		ModelAndView model= new ModelAndView();
		model.addObject("nome", "Emiliano Mercado"); 
		model.setViewName("il mio profilo");
		return model;
	}
	@RequestMapping("/valori")
	public ModelAndView valori() {
		ModelAndView model= new ModelAndView();
		model.addObject("calcoliEmi", "calcoli");
		model.setViewName("valori");
		return model;
	}
}
