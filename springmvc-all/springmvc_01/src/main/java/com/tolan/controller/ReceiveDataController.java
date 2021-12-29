package com.tolan.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ReceiveDataController {

    @RequestMapping("/getDate")
    public String getDataByPojo(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthday) {
        System.out.println("生日是：" + birthday);
        return "success";
    }
}
