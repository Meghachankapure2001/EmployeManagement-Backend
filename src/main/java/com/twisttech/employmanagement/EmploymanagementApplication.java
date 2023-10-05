package com.twisttech.employmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.twisttech.employmanagement ")
public class EmploymanagementApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmploymanagementApplication.class, args);
	}

}
