package com.tooolan.controller;

import com.tooolan.domain.Account;
import com.tooolan.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    //查询所有用户
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        model.addAttribute("list", accountService.findAll());
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account) {
        accountService.save(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/findById")
    public String findById(Integer id, Model model) {
        Account account = accountService.findById(id);
        model.addAttribute("account", account);
        return "update";
    }

    @RequestMapping("/update")
    public String update(Account account) {
        accountService.update(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/deleteBatch")
    public String deleteBatch(Integer[] ids) {
        accountService.deleteBatch(ids);
        return "redirect:/account/findAll";
    }
}
