package com.tooolan.mapper;

import com.tooolan.pojo.User;

import java.util.List;

public interface UserMapper {
    User findUser(String uname, String password);

    List<User> findAllUser();
}
