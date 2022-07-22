package com.lucianobrito.pruductsconsumer.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lucianobrito.pruductsconsumer.entities.Product;
import com.lucianobrito.pruductsconsumer.services.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {
	
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAllProducts() {
		return ResponseEntity.ok().body(service.findAllProducts());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findProduct(@PathVariable("id") UUID id) {
		return ResponseEntity.ok().body(service.findById(id));
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
}
