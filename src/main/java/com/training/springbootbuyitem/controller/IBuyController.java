package com.training.springbootbuyitem.controller;

import com.training.springbootbuyitem.entity.model.Item;
import com.training.springbootbuyitem.entity.request.CreateItemRequestDto;
import com.training.springbootbuyitem.entity.request.DispatchItemRequestDto;
import com.training.springbootbuyitem.entity.request.RestockItemRequestDto;
import com.training.springbootbuyitem.entity.response.CreateItemResponseDto;
import com.training.springbootbuyitem.entity.response.GetItemResponseDto;
import com.training.springbootbuyitem.entity.response.UpdateItemResponseDto;
import com.training.springbootbuyitem.utils.annotation.ServiceOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface IBuyController {

	@PostMapping
	@ServiceOperation("createItem")
	ResponseEntity<CreateItemResponseDto> createItem(@RequestBody @Valid CreateItemRequestDto request);

	@GetMapping("/{id}")
	@ServiceOperation("getItem")
	ResponseEntity<GetItemResponseDto> getItem(@PathVariable("id") Long id);

	@PostMapping("/list-items")
	@ServiceOperation("listItems")
	ResponseEntity<List<GetItemResponseDto>> listItems(@RequestBody List<Long> ids);

	@PatchMapping("/{id}")
	@ServiceOperation("updateItem")
	ResponseEntity<UpdateItemResponseDto> updateItem(@PathVariable("id") Long id, @RequestBody Item item);

	@DeleteMapping("/{id}")
	@ServiceOperation("deleteItem")
	ResponseEntity<HttpStatus> deleteItem(@PathVariable("id") Long id);

	@GetMapping
																																																																																																																																																																																																																																																																																																								@ServiceOperation("listItems")
	ResponseEntity<List<GetItemResponseDto>> listItems();

	@PostMapping("/{id}/dispatch")
	@ServiceOperation("dispatchItem")
	ResponseEntity<HttpStatus> dispatchItem(@PathVariable("id") Long id,
                                            @RequestBody DispatchItemRequestDto request);

	@PostMapping("/{id}/blockItem")
	@ServiceOperation("blockItem")
	ResponseEntity<HttpStatus> blockItem(@PathVariable("id") Long id,
                                            @RequestBody DispatchItemRequestDto request);

	@PostMapping("/{id}/{user}/blockItemForUser")
	@ServiceOperation("blockItemForUser")
	ResponseEntity<HttpStatus> blockItemForUser(@PathVariable("id") Long id, @PathVariable("user") Long userId,
                                            @RequestBody DispatchItemRequestDto request);

	@PostMapping("/{id}/restock")
	@ServiceOperation("restockItem")
	ResponseEntity<HttpStatus> restockItem(@PathVariable("id") Long id,
                                           @RequestBody RestockItemRequestDto request);
}
