package com.lucianobrito.pruductsproducer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucianobrito.pruductsproducer.entities.Product;
import com.lucianobrito.pruductsproducer.service.ProductsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductsController {

	private ProductsService service;
	
	@GetMapping
	public ResponseEntity<Product> sendProduct() {
		return ResponseEntity.ok().body(service.sendProduct());
	}
}
