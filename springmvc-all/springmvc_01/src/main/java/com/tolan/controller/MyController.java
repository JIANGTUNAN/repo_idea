package com.tolan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tooolan")
public class MyController {

    @RequestMapping("/firstController")
    public String firstController() {
        System.out.println("firstController!");
        return "first";
    }


    @RequestMapping(value = "/testRequest")
    public String testRequest() {
        System.out.println("testRequest");
        return "success";
    }

}
