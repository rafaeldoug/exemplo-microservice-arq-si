package br.cesed.si.arq.microservice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Microservice01Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice01Application.class, args);
	}

}
