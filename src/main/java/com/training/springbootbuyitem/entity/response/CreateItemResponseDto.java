package com.training.springbootbuyitem.entity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateItemResponseDto {

	private Long itemUid;

	public Long getItemUid() {
		return itemUid;
	}

	public void setItemUid(Long itemUid) {
		this.itemUid = itemUid;
	}
}
