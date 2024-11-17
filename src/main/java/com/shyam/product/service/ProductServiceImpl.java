package com.shyam.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shyam.product.document.Product;
import com.shyam.product.repository.ProductRepositry;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepositry productRepositry;
	
	@Override
	public List<Product> getAllProduct() {

		return productRepositry.findAll();
	}

	@Override
	public Product fetchById(Long id) {
		// TODO Auto-generated method stub
		return productRepositry.findById(id).get();
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepositry.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepositry.save(product);
	}

	@Override
	public String deleteProduct(Long id) {
		productRepositry.deleteById(id);		
		return "Product Deleted Successfully!";
	}

}
