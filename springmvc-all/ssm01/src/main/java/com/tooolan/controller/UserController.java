package com.tooolan.controller;

import com.tooolan.pojo.User;
import com.tooolan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(String uname, String password) {
        System.out.println("/login");
        User user = userService.findUser(uname, password);
        return user == null ? "/fail.jsp" : "/success.jsp";
    }

    @ResponseBody
    @RequestMapping("findAllUser")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
