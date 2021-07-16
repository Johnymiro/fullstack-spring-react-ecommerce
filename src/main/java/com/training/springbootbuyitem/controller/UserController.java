package com.training.springbootbuyitem.controller;

import com.training.springbootbuyitem.service.CustomSessionService;
import com.training.springbootbuyitem.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @Autowired
    private CustomSessionService customSessionService;


    @Autowired
    private ModelMapper mapper;


}
