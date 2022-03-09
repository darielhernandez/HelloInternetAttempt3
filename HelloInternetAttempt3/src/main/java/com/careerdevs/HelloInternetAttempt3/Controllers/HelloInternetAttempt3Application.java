package com.careerdevs.HelloInternetAttempt3.Controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloInternetAttempt3Application {

	@GetMapping ("/")
	public String rootRoute(){
		return "NIMBUS";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloInternetAttempt3Application.class, args);
	}

}
