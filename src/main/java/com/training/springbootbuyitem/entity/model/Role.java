package com.training.springbootbuyitem.entity.model;

import com.training.springbootbuyitem.enums.EnumProfile;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EnumProfile name;

    public Role() {
    }

    public Role(EnumProfile name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EnumProfile getName() {
        return name;
    }

    public void setName(EnumProfile name) {
        this.name = name;
    }
}