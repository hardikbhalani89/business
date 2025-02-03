package com.myhome.business.service.impl;

import com.myhome.business.converter.UserConverter;
import com.myhome.business.model.User;
import com.myhome.business.repository.UserRepository;
import com.myhome.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.myhome.business.model.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserResponse findOne(Integer userId) {
        UserResponse response = new UserResponse();
        response.setUser(userConverter.fromEntity(userRepository.findById(userId).orElse(new User())));
        return response;
    }


}
