package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {

    // user operations

    //create
    User saveUser(User user);

    //get all
    List<User> getAllUsers();

    //get single user of given userId
    User getUser(String userId);

    //delete single user
    User deleteUser(String userId);

    //update user
    User updateUser(String userId, User user);
}
