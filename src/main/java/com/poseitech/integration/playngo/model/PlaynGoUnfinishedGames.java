package com.poseitech.integration.playngo.model;

import java.io.Serializable;
import java.util.List;

public final class PlaynGoUnfinishedGames implements Serializable {

   private static final long serialVersionUID = 6425043746985359191L;
   private List<PlaynGoOpenGame> games;

   public List<PlaynGoOpenGame> getGames() {
      return games;
   }

   public void setGames(List<PlaynGoOpenGame> games) {
      this.games = games;
   }

}
