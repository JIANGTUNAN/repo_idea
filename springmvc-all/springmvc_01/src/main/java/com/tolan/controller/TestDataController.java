package com.tolan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class TestDataController {

    //紧耦合参数获取方式
    @RequestMapping("/getParamByRequest")
    public void getParam(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("getParamByRequest: username:" + username + "  --password:" + password);
        response.sendRedirect(request.getContextPath() + "/success.jsp");
    }

    //解耦合参数获取方式
    @RequestMapping("/getParamByArgName")
    public String getParam(String username,String password) {
        System.out.println("getParamByArgName: username:" + username + "  --password:" + password);
        return "getParamSuccess";
    }


}
