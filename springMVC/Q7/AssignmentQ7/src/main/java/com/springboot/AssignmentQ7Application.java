package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AssignmentQ7Application {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentQ7Application.class, args);
	}

}
