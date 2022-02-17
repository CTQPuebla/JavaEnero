package com.msdoctores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.persistence.repository")
@EntityScan("com.persistence.entity")
public class MsDoctoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDoctoresApplication.class, args);
	}

}
