package com.training.springbootbuyitem.entity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemRequestDto {

	@NotEmpty
	private String name;
	private String description;
	@NotEmpty
	private String market;
	@NotNull
	@PositiveOrZero
	private Integer stock;
	@NotNull
	@PositiveOrZero
	private Double priceTag;
}
