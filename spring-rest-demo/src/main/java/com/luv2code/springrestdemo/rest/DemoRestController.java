package com.luv2code.springrestdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World from rest controller..!!";
	}
}
