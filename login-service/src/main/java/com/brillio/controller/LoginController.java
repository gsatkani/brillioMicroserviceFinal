package com.brillio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

	@GetMapping("user")
	//@ResponseStatus(code = HttpStatus.OK)
	public String getLoginPage() {
		return "Welcome to Login Page";
	}
	
	
}
