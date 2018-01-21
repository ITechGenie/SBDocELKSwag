package com.itechgenie.apps.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
public class ApplicationLoader {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationLoader.class, args);
	}
}