package com.example.fisnoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients(value="com.example.fisnoteservice.service")
public class FisnoteserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisnoteserviceApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
