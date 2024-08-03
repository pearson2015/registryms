package com.myhotel.registryms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistrymsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrymsApplication.class, args);
	}

}
