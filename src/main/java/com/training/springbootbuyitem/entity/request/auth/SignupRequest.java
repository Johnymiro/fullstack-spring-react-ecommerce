package com.training.springbootbuyitem.entity.request.auth;

import com.training.springbootbuyitem.enums.EnumProfile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String username;
    private String password;
    private String email;
    private Set<String> role;

   /* public String getUsername() {
        return username;
    }
    public void setUserName(String user) {
        this.username = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password= password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } */
}
