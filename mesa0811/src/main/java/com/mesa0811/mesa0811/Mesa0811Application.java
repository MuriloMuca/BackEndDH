package com.mesa0811.mesa0811;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Mesa0811Application {

	public static void main(String[] args) {
		SpringApplication.run(Mesa0811Application.class, args);
	}

	@GetMapping
	public String Hello(){
		return "Hello";
	}
}
