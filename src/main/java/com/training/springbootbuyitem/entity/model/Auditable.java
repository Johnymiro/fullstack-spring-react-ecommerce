package com.training.springbootbuyitem.entity.model;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

public class Auditable {

	@CreatedBy
	private String createdBy;
	@LastModifiedDate
	private Instant modifiedAt;
	@CreatedDate
	private Instant createdAt;
	@LastModifiedBy
	private String lastModifiedBy;

}
