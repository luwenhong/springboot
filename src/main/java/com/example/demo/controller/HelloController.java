package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/*
* @requestbody
* @controller
* */
@RestController
public class HelloController {
	@RequestMapping("/car")
	public String test1(){
		
		return "成功了";}
		
	@PostMapping("/login")
	public String login(String name,Integer pwd){
		return name+pwd ;
	}
}
