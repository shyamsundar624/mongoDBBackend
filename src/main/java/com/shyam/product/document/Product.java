package com.shyam.product.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "products")
public class Product {
@Id

	private long id;
@Transient
public static final String SEQUENCE_NAME="product_sequence";
	private String name;
	private String category;
	private String brand;
}
