package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.controller","com.model","com.service"})
public class EPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPortalApplication.class, args);
	}

}
