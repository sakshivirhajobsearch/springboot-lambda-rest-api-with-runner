package com.aws.restapi.with.runner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Optional base path
public class HelloController {

	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "World") String name) {
		return "Hello, " + name + "!";
	}
}