package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example")
@EntityScan("com.example.dao")
@SpringBootApplication
@Configuration
public class OnlineExamSpringBootApplication {

	@Autowired
	DataSource datasource;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineExamSpringBootApplication.class, args);
	}

}
