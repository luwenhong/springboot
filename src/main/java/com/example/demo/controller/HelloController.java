package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @requestbody
* @controller
* */
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String handle01(){
		return "hello, springboot2";
	}
	
}
