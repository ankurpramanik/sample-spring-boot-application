package com.ada.poc.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.ada.poc.svc.controller", "com.ada.poc.svc.service" })
@EnableJpaRepositories(basePackages = { "com.ada.poc.svc.repo" })
@EntityScan(basePackages = "com.ada.poc.svc.data")
public class SampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleSpringBootApplication.class, args);
	}

}
