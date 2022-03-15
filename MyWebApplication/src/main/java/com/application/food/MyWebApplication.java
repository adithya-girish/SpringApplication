package com.application.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.application.food.MyWebApplication", "com.application.food.controller" })
@EnableJpaRepositories("com.application.food.repository")
@EntityScan("com.application.food.models")
public class MyWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebApplication.class, args);
	}

}
