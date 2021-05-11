package com.example.demo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
@RequestMapping(value = "/api")
public class TestApp {
	private Logger logger = LoggerFactory.getLogger(TestApp.class);
	
	@RequestMapping(value = "/welcome")
	public String welcome() {
		logger.info("Hello This is Spring Boot Rest Api!");
		return "Welcome in Java world";
	}

}
