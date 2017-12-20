package com.example.graphqlspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GraphqlConfiguration.class)
public class GraphqlSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringBootApplication.class, args);
	}
}
