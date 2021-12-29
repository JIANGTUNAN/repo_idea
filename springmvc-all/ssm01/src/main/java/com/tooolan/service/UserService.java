package com.tooolan.service;

import com.tooolan.pojo.User;

import java.util.List;

public interface UserService {
    User findUser(String uname, String password);

    List<User> findAllUser();
}
