package com.expedia.code.academy.amman.spring.worldcup.games;

import com.expedia.code.academy.amman.spring.worldcup.teams.Team;

public interface Game {
    void setTeamOne(Team team);
    Team getTeamOne();
    void setTeamTwo(Team team);
    Team getTeamTwo();
    String play();
}
