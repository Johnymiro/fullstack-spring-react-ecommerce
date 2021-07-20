package com.training.springbootbuyitem.entity.request.user;

import com.training.springbootbuyitem.entity.model.Role;
import com.training.springbootbuyitem.enums.EnumProfile;
import com.training.springbootbuyitem.enums.EnumState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String username;

    @Enumerated(EnumType.STRING)
    private EnumState state;

    private Set<Role> roles;

   //   There is a need for new object to store User operations
}