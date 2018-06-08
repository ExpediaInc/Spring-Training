package com.expedia.code.academy.amman.spring.worldcup;

import com.expedia.code.academy.amman.spring.worldcup.games.FinalGame;
import com.expedia.code.academy.amman.spring.worldcup.games.Game;

public class Application {
  public static void main(String[] args) {
    Game g = new FinalGame();
    System.out.printf("The winner team is: %s", g.play());
  }
}
