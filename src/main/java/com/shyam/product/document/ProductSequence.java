package com.shyam.product.document;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document(collection = "products_sequence")
public class ProductSequence {

	private String id;
	private long  seq;
}
