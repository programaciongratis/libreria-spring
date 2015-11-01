package com.programaciongratis.libreria.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibrosController {
	
	@RequestMapping("/libro")
	public ModelAndView getHelloMessage() {
		String message = "Un mensaje desde Spring!";
		
		return new ModelAndView("libro", "message", message);
	}

}
