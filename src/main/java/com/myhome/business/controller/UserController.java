package com.myhome.business.controller;


import com.myhome.business.model.UserResponse;
import com.myhome.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping( value="/getUserName", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getUserName(@RequestBody int userId) {
        return userService.findOne(userId);
    }

}
