package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
@GetMapping("/greet")
public String message() {
	return "hellooooooo";
}
}
