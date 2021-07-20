package com.training.springbootbuyitem.entity.response.user;

import com.training.springbootbuyitem.entity.model.Role;
import com.training.springbootbuyitem.enums.EnumProfile;
import com.training.springbootbuyitem.enums.EnumState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserResponseDto {

    private String name;
    private String email;
    private String password;
    private String username;
    private EnumState state;
    private Set<Role> roles;
}

