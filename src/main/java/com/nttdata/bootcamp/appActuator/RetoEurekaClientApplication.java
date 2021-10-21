package com.nttdata.bootcamp.appActuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RetoEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoEurekaClientApplication.class, args);
	}

}
