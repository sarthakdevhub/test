package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.app")
public class ProspectaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProspectaTestApplication.class, args);
	}

}
