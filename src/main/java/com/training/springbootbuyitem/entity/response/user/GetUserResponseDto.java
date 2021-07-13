package com.training.springbootbuyitem.entity.response.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponseDto extends CreateUserResponseDto{
    private String name;
    private String state;
    private String description;
    private String market;
    private BigInteger stock;
    private BigDecimal priceTag;

}
