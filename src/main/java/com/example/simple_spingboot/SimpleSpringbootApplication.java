package com.example.simple_spingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootApplication.class, args);
	}

	// function that when I access the page /hello from localhost will return "Hello
	// {name}"
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("Hello testers");
		return String.format("Hello %s!", name);

	}

	// function that maps to home page and works likewise to hello function
	@GetMapping("/home")
	public String home(@RequestParam(value = "name", defaultValue = "test test") String name) {
		System.out.println("home works");
		return String.format("This is the home page, hello %s", name);

	}

}
