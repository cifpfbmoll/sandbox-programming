package com.studentsfp.devenvironment.unittesting.p1.data.competition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

public class CompetitionHelper {

    private static final Logger log = LoggerFactory.getLogger(CompetitionHelper.class);

    public static List<Player> getRandomPlayers(int size,String baseName, String baseSurname){
        List<Player> data = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            Player player = new Player();
            player.setName(baseName + i);
            if(!baseSurname.equals("")){
                player.setSurname(baseSurname + i);
            }
            data.add(player);
        }
        return data;

    }
}
