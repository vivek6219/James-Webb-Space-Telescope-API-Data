package com.jwst.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class JwstImageApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(JwstImageApiApplication.class, args);
	}

}
