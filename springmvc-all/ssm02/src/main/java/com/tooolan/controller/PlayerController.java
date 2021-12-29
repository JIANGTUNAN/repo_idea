package com.tooolan.controller;

import com.tooolan.pojo.Player;
import com.tooolan.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/addPlayer")
    public String addPlayer(Player player) {
        playerService.addPlayer(player);
        return "redirect:showPlayer.jsp";
    }

    @RequestMapping("getAllPlayer")
    @ResponseBody
    public List<Player> getAllPlayer() {
        return playerService.getAllPlayer();
    }
}
