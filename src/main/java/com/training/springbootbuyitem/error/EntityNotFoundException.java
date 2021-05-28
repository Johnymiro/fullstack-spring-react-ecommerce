package com.training.springbootbuyitem.error;


import com.training.springbootbuyitem.constant.BuyItemConstant;

public class EntityNotFoundException extends RuntimeException {

	public EntityNotFoundException(String entity, Long id) {
		this(String.format(BuyItemConstant.ENTITY_NOT_FOUND_MSG, entity, id));
	}

	private EntityNotFoundException(String message) {
		super(message);
	}
}
