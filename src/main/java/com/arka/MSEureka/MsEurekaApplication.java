package com.arka.MSEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsEurekaApplication {

	public static void main(String[] args) {
		System.out.println("starting eureka server");
		SpringApplication.run(MsEurekaApplication.class, args);
		System.out.println("eureka server started successfully on http://localhost:8761");
	}

}
