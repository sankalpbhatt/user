package com.pyl.user.service;

import com.pyl.user.entity.User;
import com.pyl.user.mapper.UserMapper;
import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserResponse createUser(UserRequest userRequest){
        User user = userMapper.mapRequestToEntity(userRequest);
        return userMapper.mapEntityToResponse(user);
    }

}
