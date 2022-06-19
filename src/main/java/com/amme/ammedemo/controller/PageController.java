package com.amme.ammedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	@GetMapping("/")
	public String homepage() {
		return "index";
	}
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
}
