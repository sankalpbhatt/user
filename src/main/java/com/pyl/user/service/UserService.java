package com.pyl.user.service;

import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);

}
