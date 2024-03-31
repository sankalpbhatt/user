package com.pyl.user.service;

import com.pyl.user.model.UserPageResponse;
import com.pyl.user.model.UserRequest;
import com.pyl.user.model.UserResponse;
import com.pyl.user.model.UserSearchCriteria;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);

    UserPageResponse searchUsers(UserSearchCriteria userSearchCriteria);

}
