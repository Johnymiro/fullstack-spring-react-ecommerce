package com.training.springbootbuyitem.repository;

import com.training.springbootbuyitem.entity.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}