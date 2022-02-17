package com.msdiagnostico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.persistence.repository")
@EntityScan("com.persistence.entity")
public class MsDiagnosticoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDiagnosticoApplication.class, args);
	}

}