package com.altimetrik;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping
	public String greeting() {
		return "Hello";
	}
	
	@PreAuthorize("hasRole('USER')")
	@GetMapping("/user")
	public String userGrerting() {
		return "Hello, User";
	}

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/admin")
	public String adminGrerting() {
		return "Hello, Admin";
	}
}
