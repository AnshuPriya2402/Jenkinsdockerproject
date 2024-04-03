package com.nagarro.testspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

	@GetMapping("/")
	public String home() {
		return "Hi Anshu,I am Deployed on Docker";
		
	}
}
