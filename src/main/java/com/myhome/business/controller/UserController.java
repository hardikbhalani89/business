package com.myhome.business.controller;

import com.myhome.business.config.properties.InternalResourcePropertiesBean;
import com.myhome.business.model.UserResponse;
import com.myhome.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private InternalResourcePropertiesBean internalResourcePropertiesBean;

    @RequestMapping( value="/getUserName", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public UserResponse getUserName(@RequestBody int userId) {
         System.out.println("my name is : "+internalResourcePropertiesBean.getName());
         return userService.findOne(userId);
    }

}
