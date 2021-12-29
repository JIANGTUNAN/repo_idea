package com.tolan.controller;

import com.tolan.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

    /*
      @ResponseBody
      不再跳转页面，自动转为内容为JSON响应给浏览器
     */
    @ResponseBody
    @RequestMapping("/testAjax")
    public Pet testAjax() {
        Pet pet = new Pet("Tom", "cat");
        return pet;
    }
}
