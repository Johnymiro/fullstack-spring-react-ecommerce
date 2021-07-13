package com.training.springbootbuyitem.entity.request.user;

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
public class CreateUserRequestDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String email;
    @NotNull
    @PositiveOrZero
    private Integer profileLevel;
    @NotEmpty
    private String profile;

    private String description;

   //   There is a need for new object to store User operations
}