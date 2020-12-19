package com.studentsfp.devenvironment.unittesting.p1.data.competition;

import java.util.List;

/**
 * com.fbmoll.programming.data.competition
 * Class Team
 * 17/12/2020
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Team {
    private List<Player> playerList;
    private String name;
    private String icon;

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
