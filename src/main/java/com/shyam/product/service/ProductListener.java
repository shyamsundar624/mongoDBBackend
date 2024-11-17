package com.shyam.product.service;

import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.shyam.product.document.Product;

@Component
public class ProductListener extends AbstractMongoEventListener<Product> {

	private final SequenceGeneratorService sequenceGeneratorService;

	public ProductListener(SequenceGeneratorService sequenceGeneratorService) {
		this.sequenceGeneratorService = sequenceGeneratorService;
	}

	@Override
	public void onBeforeConvert(BeforeConvertEvent<Product> event) {
		if (event.getSource().getId() < 1) {
event.getSource().setId(sequenceGeneratorService.generateSequence(Product.SEQUENCE_NAME));
		}
	}
}
