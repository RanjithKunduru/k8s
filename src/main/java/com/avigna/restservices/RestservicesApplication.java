package com.avigna.restservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.avigna.products")
public class RestservicesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RestservicesApplication.class, args);
	}

}

