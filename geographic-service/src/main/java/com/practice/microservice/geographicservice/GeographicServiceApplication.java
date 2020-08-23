package com.practice.microservice.geographicservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GeographicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeographicServiceApplication.class, args);
	}

}
