package com.dcs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DeveloperCommunityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperCommunityServiceApplication.class, args);
		System.out.println("Successfull");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();

	}

}
