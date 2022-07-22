package com.lucianobrito.pruductsproducer.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lucianobrito.pruductsproducer.entities.Product;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class ProductsService {
	
	private WebClient webClient;

	public Product sendProduct() {
		Product product = new Product(null, "Computador", 3000D);
		
		Mono<Product> response = webClient
			.post()
			.uri("/products")
			.body(Mono.just(product), Product.class)
			.retrieve()
			.bodyToMono(Product.class);
		
		return response.block();
	}
}
