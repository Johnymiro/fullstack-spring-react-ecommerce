package com.training.springbootbuyitem.entity.request;

import javax.validation.constraints.PositiveOrZero;

public class UpdateItemRequestDto {

	private String name;
	private String state;
	private String description;
	private String market;
	@PositiveOrZero
	private Integer stock;
	@PositiveOrZero
	private Double priceTag;

}
