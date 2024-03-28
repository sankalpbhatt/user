package com.pyl.user.mapper;

import com.pyl.user.entity.User;
import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapRequestToEntity(UserRequest request){
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPhone(request.getPhone());
        return user;
    }

    public UserResponse mapEntityToResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setUsername(user.getUsername());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setPhone(user.getPhone());
        return userResponse;
    }

}
