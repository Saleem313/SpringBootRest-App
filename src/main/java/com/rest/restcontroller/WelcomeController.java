package com.rest.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> wish(){
		return new ResponseEntity<>("Assalamualikum, Welcome to Rest Controller", HttpStatus.OK);
	}

}
