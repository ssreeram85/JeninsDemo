package com.sree.tech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JeninsDemoApplication {
	
	private static Logger logger = LoggerFactory.getLogger(JeninsDemoApplication.class);
	
	public  intt() {
		logger.info("Application started with init ...");
	}

	public static void main(String[] args) {
		logger.info("Application started with main ...");
		SpringApplication.run(JeninsDemoApplication.class, args);
	}

}
