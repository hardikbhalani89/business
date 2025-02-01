package com.myhome.business.service;

import com.myhome.business.model.UserResponse;

public interface UserService {

    UserResponse findOne(Integer userId);

}
