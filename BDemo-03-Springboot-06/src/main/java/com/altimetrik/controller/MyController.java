package com.altimetrik.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "<h1>Welcome to Spring Boot Application</h1>";
	}
	
	@GetMapping("/login")
	public String login() {
		return "<h1>Login Page</h1>";
	}
	
	@GetMapping("/sign-up")
	public String signUp() {
		return "<h1>Sign Up Page</h1>";
	}
}
