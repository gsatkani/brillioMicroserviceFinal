package com.brillio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/registration")
public class RegistrationContoller {
	
	@GetMapping(path = "/register")
    //@ResponseStatus(code =  HttpStatus.OK,reason = "Trail Page")
	public String getReagistrationHomePage() {
		return "Welcome to Registration Page";
	}
	

}
