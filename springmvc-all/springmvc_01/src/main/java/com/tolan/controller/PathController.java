package com.tolan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {


    @RequestMapping("/testPathVariable/{id}/{username}")
    public String testPathVariable(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println(id + ":" + username);
        System.out.println("testPathVariable!");
        return "success";
    }
}
