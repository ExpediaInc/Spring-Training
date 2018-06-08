package com.expedia.code.academy.amman.spring.worldcup.games;

import com.expedia.code.academy.amman.spring.worldcup.teams.Brazil;
import com.expedia.code.academy.amman.spring.worldcup.teams.Germany;
import com.expedia.code.academy.amman.spring.worldcup.teams.Team;

public class FinalGame implements Game {
  private Team teamOne;
  private Team teamTwo;

  public FinalGame() {
    this.teamOne = new Germany();
    this.teamTwo = new Brazil();
  }

  @Override
  public Team getTeamOne() {
    return teamOne;
  }

  @Override
  public void setTeamOne(Team teamOne) {
    this.teamOne = teamOne;
  }

  @Override
  public void setTeamTwo(Team teamTwo) {
    this.teamTwo = teamTwo;
  }

  @Override
  public Team getTeamTwo() {
    return teamTwo;
  }

  @Override
  public String play() {
    return Math.random() < 0.5 ? getTeamOne().getName() :
        getTeamTwo().getName();
  }

  @Override
  public String toString() {
    return String.format("Game between %s at %s", teamOne.getName(), teamTwo.getName());
  }
}
