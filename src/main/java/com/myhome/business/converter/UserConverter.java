package com.myhome.business.converter;

import com.myhome.business.model.User;
import com.myhome.business.model.UserDTO;

import java.util.Optional;

public class UserConverter {

    public User fromDto(UserDTO dto){
        User user = new User();
        user.setUserId(dto.getUserId());
        user.setUserName(dto.getUserName());
        user.setUserTypeCode(dto.getUserTypeCode());
        return user;
    }

    public UserDTO fromEntity(User entity){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(entity.getUserId());
        userDTO.setUserName(entity.getUserName());
        userDTO.setUserTypeCode(entity.getUserTypeCode());
        return userDTO;
    }

}
