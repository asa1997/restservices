package com.example.restservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestserviceApplication.class);
		app.run(args);
	}

}
