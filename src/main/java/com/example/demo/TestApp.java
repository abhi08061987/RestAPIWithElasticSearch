package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TestApp {
	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "Welcome in Java world";
	}

}
