package com.tooolan.mapper;

import com.tooolan.pojo.Player;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PlayerMapper {

    int addPlayer(Player player);

    @Select("SELECT * FROM player")
    List<Player> findAllPlayer();
}
