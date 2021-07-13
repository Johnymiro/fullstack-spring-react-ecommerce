package com.training.springbootbuyitem.entity.response.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponseDto {

    private Long userUid;

    public Long getUserid() {
        return userUid;
    }

    public void setUserUid(Long userUid) {
        this.userUid = userUid;
    }
}
