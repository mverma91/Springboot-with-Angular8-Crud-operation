package com.employeDetails.application.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.employeDetails.application.*"})
public class GetEmployeeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetEmployeeDetailsApplication.class, args);
	}

}
