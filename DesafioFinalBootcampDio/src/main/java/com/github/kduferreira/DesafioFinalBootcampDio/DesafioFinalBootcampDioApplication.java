package com.github.kduferreira.DesafioFinalBootcampDio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioFinalBootcampDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioFinalBootcampDioApplication.class, args);
	}

}
