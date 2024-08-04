package com.example.demo3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
	@GetMapping("/loginForm")
	String loginForm() {
		return "login";
	}
}