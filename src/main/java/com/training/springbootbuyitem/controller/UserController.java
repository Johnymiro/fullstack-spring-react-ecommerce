package com.training.springbootbuyitem.controller;

import com.training.springbootbuyitem.entity.model.User;
import com.training.springbootbuyitem.entity.request.user.CreateUserRequestDto;
import com.training.springbootbuyitem.entity.response.user.GetUserResponseDto;
import com.training.springbootbuyitem.entity.response.user.UpdateUserResponseDto;
import com.training.springbootbuyitem.service.CustomSessionService;
import com.training.springbootbuyitem.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController implements IUserController {

    @Autowired
    private UserService userService;


    @Autowired
    private CustomSessionService customSessionService;


    @Autowired
    private ModelMapper mapper;


    @Override
    public ResponseEntity<CreateUserRequestDto> createUser(CreateUserRequestDto request) throws Exception {
        return null;
    }

    @Override
    public ResponseEntity<UpdateUserResponseDto> updateUser(Long id, User user) {
        return null;
    }

    @Override
    public ResponseEntity<GetUserResponseDto> getUser(Long id) {
        return null;
    }
}
