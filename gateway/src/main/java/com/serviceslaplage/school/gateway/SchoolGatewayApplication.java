package com.serviceslaplage.school.gateway;

import feign.Feign;
import feign.gson.GsonDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SchoolGatewayApplication {

	Logger logger = LoggerFactory.getLogger(SchoolGatewayApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchoolGatewayApplication.class, args);
	}

	@Bean
	public Feign.Builder builder() {
		logger.info("********************** CREATE BUILDER FOR API CLIENT ********************");
		return Feign.builder().decoder(new GsonDecoder());
	}

}
