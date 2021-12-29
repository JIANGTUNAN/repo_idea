package com.tooolan.service.impl;

import com.tooolan.mapper.PlayerMapper;
import com.tooolan.pojo.Player;
import com.tooolan.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerMapper playerMapper;

    @Override
    public int addPlayer(Player player) {
        return playerMapper.addPlayer(player);
    }

    @Override
    public List<Player> getAllPlayer() {
        System.out.println();
        return playerMapper.findAllPlayer();
    }
}
