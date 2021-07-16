package com.training.springbootbuyitem.service;

import com.training.springbootbuyitem.entity.model.Item;
import com.training.springbootbuyitem.entity.model.User;

public interface IUserService extends ICrudService<User> {

    void update(Long id, String name);

}
