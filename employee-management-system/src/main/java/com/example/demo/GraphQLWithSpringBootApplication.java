package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.repository")
@ComponentScan(basePackages = "com.example")
@ComponentScan({"com.example.query","com.example.mutation","com.example.Security","com.example.aspect"})
@EntityScan("com.example.entity")
public class GraphQLWithSpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphQLWithSpringBootApplication.class, args);
	}
}

