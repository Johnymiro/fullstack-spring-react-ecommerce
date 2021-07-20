package com.training.springbootbuyitem.entity.request.auth;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private String username;
    private String password;

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
    }*/
}
