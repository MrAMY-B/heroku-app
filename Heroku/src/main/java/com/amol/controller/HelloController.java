package com.amol.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/greet")
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHekkoToClient() {
		return "Hello There welcome to My Application Finance Service";
	}
	

}
