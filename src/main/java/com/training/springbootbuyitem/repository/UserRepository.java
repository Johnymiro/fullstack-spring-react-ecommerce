package com.training.springbootbuyitem.repository;

import com.training.springbootbuyitem.entity.model.Item;
import com.training.springbootbuyitem.entity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {

}
