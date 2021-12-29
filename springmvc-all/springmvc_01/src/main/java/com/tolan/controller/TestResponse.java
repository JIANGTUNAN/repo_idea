package com.tolan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestResponse {


    @RequestMapping("demo1")
    public void testDemo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //request.getRequestDispatcher("/forward.jsp").forward(request, response);
        response.sendRedirect(request.getContextPath() + "/forward.jsp");
    }

    //重定向关键字: redirect:
    @RequestMapping("demo3")
    public String testDemo() {
        return "redirect:/forward.jsp";
    }

    @RequestMapping("demo5")
    public ModelAndView testDemo(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        //  mv.setViewName("forward:/forward.jsp");
        //  mv.setView(new InternalResourceView("/forward.jsp"));
        //  mv.setViewName("redirect:/forward.jsp");
        mv.setView(new RedirectView(request.getContextPath() + "/forward.jsp"));
        return mv;
    }
}
