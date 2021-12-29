package com.tooolan.controller;

import com.tooolan.pojo.User;
import com.tooolan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class ScopeController {

    @Autowired
    private UserService userService;

    //向三个请求域中放入数据
    @RequestMapping("/setData")
    public String setData(HttpServletRequest request, HttpSession session) {


        List<User> users = userService.findAllUser();

        request.setAttribute("message", "reqMessage");
        request.setAttribute("users", users);

        session.setAttribute("message", "sessionMessage");
        session.setAttribute("users", users);

        ServletContext application = request.getSession().getServletContext();
        application.setAttribute("message", "applicationMessage");
        application.setAttribute("users", users);

        //请求转发
        return "/showDataPage.jsp";
    }


    @RequestMapping("/setData2")
    public ModelAndView setData() {

        ModelAndView mv = new ModelAndView();
        Map<String, Object> model = mv.getModel();

        List<User> users = userService.findAllUser();

        model.put("message", "reqMessage");
        model.put("users", users);

        //mv.setViewName("forward:/showDataPage.jsp");
        mv.setViewName("redirect:/showDataPage.jsp");

        return mv;
    }
}
