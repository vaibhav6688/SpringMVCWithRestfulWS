package com.spring.mvc.controller;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;
import com.spring.mvc.service.UserServiceImpl;

@Controller
@Scope("session")
public class SignUpController {

	UserService userService = new UserServiceImpl();
	
	@RequestMapping(value="SaveUser")
	public ModelAndView saveUserDetails(@RequestParam Map<String, String> map)
	{
		User user = new User();
		String userName = map.get("name");
		String password = map.get("pwd");
		String email = map.get("email");
		String address = map.get("address");
		String contact = map.get("contact");
		
		user.setName(userName);
		user.setPassword(password);
		user.setEmail(email);
		user.setAddress(address);
		user.setContact(contact);

		userService.addUser(user);
		
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("home", "Registration Page");
		return model;
	}

}
