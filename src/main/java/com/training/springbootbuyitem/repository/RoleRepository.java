package com.training.springbootbuyitem.repository;

import com.training.springbootbuyitem.entity.model.Role;
import com.training.springbootbuyitem.enums.EnumProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumProfile name);
}