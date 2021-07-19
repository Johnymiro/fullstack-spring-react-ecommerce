package com.training.springbootbuyitem.controller;

import com.training.springbootbuyitem.entity.model.User;
import com.training.springbootbuyitem.entity.request.user.CreateUserRequestDto;
import com.training.springbootbuyitem.entity.response.user.GetUserResponseDto;
import com.training.springbootbuyitem.entity.response.user.UpdateUserResponseDto;
import com.training.springbootbuyitem.utils.annotation.ServiceOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface IUserController {

    @PostMapping("users/createUser")
    @ServiceOperation("createUser")
    ResponseEntity<CreateUserRequestDto> createUser(@RequestBody @Valid CreateUserRequestDto request) throws Exception;

    @PostMapping("/users/updateUser/{id}")
    @ServiceOperation("updateUser")
    ResponseEntity<UpdateUserResponseDto> updateUser(@PathVariable("id") Long id, @RequestBody User user);

    @GetMapping("/users/{id}")
    @ServiceOperation("getUser")
    ResponseEntity<GetUserResponseDto> getUser(@PathVariable("id") Long id );
}
