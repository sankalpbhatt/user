package com.pyl.user.controller;

import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        return new UserResponse();
    }
}
