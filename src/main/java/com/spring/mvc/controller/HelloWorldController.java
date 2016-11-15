package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Cliente;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView welcomeMessage(@RequestParam(value = "name", required = false) String name) {
		// Name of your jsp file as parameter
		ModelAndView view = new ModelAndView("hello");
		Cliente c = new Cliente();
		c.setNome("CompreAKI");
		view.addObject("cliente", c);
		return view;
	}
}