package com.pyl.user.controller;

import com.pyl.user.model.UserPageResponse;
import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import com.pyl.user.model.UserSearchCriteria;
import com.pyl.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }

    @GetMapping
    public UserPageResponse getUser(@RequestParam UserSearchCriteria userSearchCriteria){
        return userService.searchUsers(userSearchCriteria);
    }
}
