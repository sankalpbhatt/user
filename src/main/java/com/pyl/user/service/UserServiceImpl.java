package com.pyl.user.service;

import com.pyl.user.entity.User;
import com.pyl.user.mapper.UserMapper;
import com.pyl.user.model.UserPageResponse;
import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import com.pyl.user.model.UserSearchCriteria;
import com.pyl.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.pyl.user.repository.UserRepository.firstNameContains;
import static org.springframework.data.jpa.domain.Specification.where;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse createUser(UserRequest userRequest){
        User user = userMapper.mapRequestToEntity(userRequest);
        return userMapper.mapEntityToResponse(user);
    }

    @Override
    public UserPageResponse searchUsers(UserSearchCriteria userSearchCriteria){
        UserPageResponse userPageResponse = new UserPageResponse();
        List<User> usersFromDb = userRepository.findAll(
                where(firstNameContains(userSearchCriteria.getFirstName())));
        userPageResponse.setContent(usersFromDb
                .stream()
                .map(userMapper::mapEntityToResponse)
                .toList());
        userPageResponse.setPage(1);
        userPageResponse.setTotalPages(1);
        return userPageResponse;
    }

}
