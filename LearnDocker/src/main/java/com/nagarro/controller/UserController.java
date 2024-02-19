package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public User getAllUser() {
		User user = new User();
		user.setRollNo(132);
		user.setFirstName("Avinash");
		user.setLastName("Singh");
		user.setContact("3424234344");
		user.setAddress("Kanpur Uttar Pradesh");
		return user;
	}
	
}
