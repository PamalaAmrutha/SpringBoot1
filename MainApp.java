package com.Amrutha.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
		System.out.println("Main app Started");
		SpringApplication.run(MainApp.class, args);
		
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		return builder.sources(MainApp.class);    
	}
		
		
	}


