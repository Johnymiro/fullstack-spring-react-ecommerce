package com.training.springbootbuyitem.entity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;


@Proxy(lazy = false)
@Entity
@Table(name = "user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_uid")
    private Long userUid;
    private String name;
    private String description;

    @Column(unique = true)
    private String email;

    private String profile;
    private Integer profileLevel;
    private String userName;


    public User(String name, String userName){
        this.name = name;
        this.userName = userName;
    }

    public Long getUserUid() {
        return userUid;
    }

    public String getUserProfile() {
        return profile;
    }

    public Integer getUserProfileLevel() {
        return profileLevel;
    }

    public void setUserUid(Long userUid) {
        this.userUid= userUid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    public void setDescription(String description) {
        this.description = description;
    }
}
