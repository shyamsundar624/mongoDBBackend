package com.shyam.product.service;

import java.util.List;

import com.shyam.product.document.Product;

public interface ProductService {

	List<Product> getAllProduct();
	Product fetchById(Long id);
	Product createProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(Long id);
	
}
