package com.shyam.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shyam.product.document.Product;

public interface ProductRepositry extends MongoRepository<Product,Long>{

}
