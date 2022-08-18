package com.example.microservices.comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.example.microservices.comments")
@EnableEurekaClient
public class CommentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentserviceApplication.class, args);
	}

}
