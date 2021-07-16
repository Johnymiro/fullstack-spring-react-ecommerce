package com.training.springbootbuyitem.entity.model;

import com.training.springbootbuyitem.enums.EnumProfile;
import com.training.springbootbuyitem.enums.EnumState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

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

    private String password;

    @Column(unique = true)
    private String email;
    private String userName;

    @Enumerated(EnumType.STRING)
    private EnumProfile profile;
    @Enumerated(EnumType.STRING)
    private EnumState state;

    public User(String name, String userName){
        this.name = name;
        this.userName = userName;
    }

    public void setUserUid(Long userUid) {
        this.userUid= userUid;
    }

    public Long getUserUid() {
        return userUid;
    }

    public void setUserProfile(EnumProfile profile) {
        this.profile= profile;
    }

    public EnumProfile getUserProfile() {
        return this.profile;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

}
