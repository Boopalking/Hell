package com.example.Hell;

import java.lang.System.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class HellApplication {

	
	public static org.slf4j.Logger logger =  LoggerFactory.getLogger(HellApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Appication started....");
	}
	
	public static void main(String[] args) {
		logger.info("Application Excecuted.....");
		SpringApplication.run(HellApplication.class, args);
	}

}
