package com.lucianobrito.pruductsconsumer.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.lucianobrito.pruductsconsumer.entities.Product;
import com.lucianobrito.pruductsconsumer.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	
	private ProductRepository repository;
	
	public List<Product> findAllProducts() {
		return repository.findAll();
	}
	
	public Product findById(UUID id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found"));
	}

	public Product findProductByName(String name) {
		return repository.findByName(name)
				.orElseThrow(() -> new RuntimeException("Product not found"));
	}
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
}
