package com.example.restservice;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RestserviceApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.address", "0.0.0.0"));
		app.run(args);
	}

}
