package com.tooolan.service;

import com.tooolan.pojo.Player;

import java.util.List;

public interface PlayerService {

    int addPlayer(Player player);

    List<Player> getAllPlayer();
}
