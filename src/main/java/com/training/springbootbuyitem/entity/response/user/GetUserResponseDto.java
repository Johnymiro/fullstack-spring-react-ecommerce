package com.training.springbootbuyitem.entity.response.user;

import com.training.springbootbuyitem.enums.EnumProfile;
import com.training.springbootbuyitem.enums.EnumState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUserResponseDto extends CreateUserResponseDto{
    private String name;
    private String email;
    private String password;
    private String userName;
    private EnumState state;
    private EnumProfile profile;

}
