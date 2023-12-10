package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("about to start demo applicatoion");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("demo application ran successfully");
	}

}

