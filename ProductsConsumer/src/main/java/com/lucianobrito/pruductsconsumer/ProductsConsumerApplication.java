package com.lucianobrito.pruductsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.lucianobrito.pruductsconsumer.entities")
public class ProductsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsConsumerApplication.class, args);
	}

}
