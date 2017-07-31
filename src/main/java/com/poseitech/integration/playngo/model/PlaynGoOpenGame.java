package com.poseitech.integration.playngo.model;

import java.io.Serializable;

public final class PlaynGoOpenGame implements Serializable {

   private static final long serialVersionUID = 3577162930492242903L;
   private long gameId;
   private String gid;
   private boolean serialized;
   private boolean mobileGame;
   private double bet;
   private String currency;
   private String gameName;
   private String gameType;

   public long getGameId() {
      return gameId;
   }

   public void setGameId(long gameId) {
      this.gameId = gameId;
   }

   public String getGid() {
      return gid;
   }

   public void setGid(String gid) {
      this.gid = gid;
   }

   public boolean isSerialized() {
      return serialized;
   }

   public void setSerialized(boolean serialized) {
      this.serialized = serialized;
   }

   public boolean isMobileGame() {
      return mobileGame;
   }

   public void setMobileGame(boolean mobileGame) {
      this.mobileGame = mobileGame;
   }

   public double getBet() {
      return bet;
   }

   public void setBet(double bet) {
      this.bet = bet;
   }

   public String getCurrency() {
      return currency;
   }

   public void setCurrency(String currency) {
      this.currency = currency;
   }

   public String getGameName() {
      return gameName;
   }

   public void setGameName(String gameName) {
      this.gameName = gameName;
   }

   public String getGameType() {
      return gameType;
   }

   public void setGameType(String gameType) {
      this.gameType = gameType;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder("PlaynGoOpenGame [");
      sb.append("gameId=").append(gameId).append(",");
      sb.append("gid=").append(gid).append(",");
      sb.append("serialized=").append(serialized).append(",");
      sb.append("mobileGame=").append(mobileGame).append(",");
      sb.append("bet=").append(bet).append(",");
      sb.append("currency=").append(currency).append(",");
      sb.append("gameName=").append(gameName).append(",");
      sb.append("gameType=").append(gameType).append(",");
      sb.append("]");
      return sb.toString();
   }

}
