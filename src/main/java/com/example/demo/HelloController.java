package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return " this is my first REST API";
	}

	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101, "talented", 94108917);
	}
}