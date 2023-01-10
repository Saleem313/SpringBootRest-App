package com.rest.restcontroller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		return new ResponseEntity<>("Bismillah, Allah bless you!!!", HttpStatus.OK);
	}
	@GetMapping("/welcome")
	public ResponseEntity<String> wish(){
		return new ResponseEntity<>("Welcome to Rest Controller", HttpStatus.OK);
	}
	
	@GetMapping("/restgreet")
	public ResponseEntity<String> restGreet(){
		return new ResponseEntity<>("Welcome to Springboot with Rest", HttpStatus.OK);
	}
    
}
