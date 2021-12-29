package com.tooolan.service.impl;

import com.tooolan.mapper.UserMapper;
import com.tooolan.pojo.User;
import com.tooolan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String uname, String password) {
        return userMapper.findUser(uname, password);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }
}
