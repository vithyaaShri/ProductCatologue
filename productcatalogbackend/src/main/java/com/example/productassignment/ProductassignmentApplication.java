package com.example.productassignment;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductassignmentApplication {
	@Bean
	public ModelMapper modelmapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {

		SpringApplication.run(ProductassignmentApplication.class, args);
	}

}
