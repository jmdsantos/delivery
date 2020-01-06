package com.coderef.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan
public class DeliveryAuthServerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DeliveryAuthServerApplication.class, args);
		
		
	}

}
