package com.example.simple_springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.simple_springboot.model.User;
import com.example.simple_springboot.model.UserServicesImpl;

@Controller
public class UserController {
	@Autowired
	private UserRepo userRepo;

	// form for creating new users
	@GetMapping("/users/new")
	public String showRegistrationForm(Model model) {
		// creating empty user object and adding it to the model
		model.addAttribute("user", new User());
		return "create_user";

	}

	// process the submission of registration for creating new user
	@PostMapping("/users")
	public String createUser(@ModelAttribute User user) {
		userRepo.save(user);
		return "redirect:/users";
	}

}
