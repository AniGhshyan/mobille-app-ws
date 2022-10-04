package com.example.mobilleappws.userService.impl;

import com.example.mobilleappws.shared.Utils;
import com.example.mobilleappws.ui.model.request.UserDetailsRequestModel;
import com.example.mobilleappws.ui.model.response.UserRest;
import com.example.mobilleappws.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImpl() {

    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetail) {
        UserRest userRest = new UserRest();
        userRest.setFirstName(userDetail.getFirstName());
        userRest.setLastName(userDetail.getLastName());
        userRest.setEmail(userDetail.getEmail());

        String userId = utils.generateUserId();
        userRest.setUserId(userId);
        if (users == null) {
            users = new HashMap<>();
        }
        users.put(userId, userRest);
        return userRest;
    }
}
