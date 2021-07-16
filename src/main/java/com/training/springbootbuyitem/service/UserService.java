package com.training.springbootbuyitem.service;

import com.training.springbootbuyitem.entity.model.Item;
import com.training.springbootbuyitem.entity.model.User;
import com.training.springbootbuyitem.repository.ItemRepository;
import com.training.springbootbuyitem.repository.UserRepository;
import com.training.springbootbuyitem.utils.properties.ItemStorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * @JavaDoc RestTemplate is a synchronous Http Client which is supported by Pivotal development team take into
     * consideration this client is deprecated and shall not be supported for LTS use instead the newly Http Client
     * WebClient which is capable of synchronous & asynchronous invocations check some code samples at:
     * https://spring.io/guides/gs/consuming-rest/
     */
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public List<User> get(List<Long> id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User update(User entity) {
        return null;
    }

    @Override
    public User save(User entity) {
        return null;
    }

    @Override
    public void update(Long id, String name) {
    }
}
