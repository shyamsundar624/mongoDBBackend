package com.shyam.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shyam.product.document.Product;
import com.shyam.product.service.ProductService;

@CrossOrigin
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/api/v1/products")
	public ResponseEntity<List<Product>> fetchAllproduct() {
		return ResponseEntity.ok(productService.getAllProduct());
	}

	@PostMapping("/api/v1/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productService.createProduct(product));
	}

	@PutMapping("/api/v1/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
		return ResponseEntity.ok(productService.updateProduct(product));
	}

	@GetMapping("/api/v1/products/{id}")
	public ResponseEntity<Product> fetchProductById(@PathVariable Long id) {
		return ResponseEntity.ok(productService.fetchById(id));
	}

	@DeleteMapping("/api/v1/products/{id}")
	public ResponseEntity<String> deleteProductById(@PathVariable Long id) {
		return ResponseEntity.ok(productService.deleteProduct(id));
	}

}
