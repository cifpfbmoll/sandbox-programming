package com.studentsfp.devenvironment.unittesting;

import com.studentsfp.devenvironment.unittesting.p1.data.competition.CompetitionHelper;
import com.studentsfp.devenvironment.unittesting.p1.data.competition.Player;
import com.studentsfp.devenvironment.unittesting.p1.data.competition.Team;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;
import java.util.List;

@SpringBootTest
public class LeagueTests {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Test
    void testArrayCollection() {
        List<Player> data = CompetitionHelper.getRandomPlayers(10,"Pepito ",null);
        for (Player item : data) {
            log.info(data.toString());
        }
        Team team = new Team();
        team.setPlayerList(data);
        log.info("fin");
    }

    @Test
    void testLinkedListCollection() {

    }

}
