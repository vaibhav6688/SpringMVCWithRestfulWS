package com.spring.mvc.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("session")
@RequestMapping(value="/")
public class IndexController {
	
	@RequestMapping(value="")
	public ModelAndView getMessage()
	{
		ModelAndView model = new ModelAndView("signUp");
		model.addObject("home", "Registration Page");
		return model;
	}

}
