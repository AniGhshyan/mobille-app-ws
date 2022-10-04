package com.example.mobilleappws.userService;

import com.example.mobilleappws.ui.model.request.UserDetailsRequestModel;
import com.example.mobilleappws.ui.model.response.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);

}
