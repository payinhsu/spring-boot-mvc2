package com.poseitech.integration.playngo.model;

import java.io.Serializable;

public class Game implements Serializable {
   private static final long serialVersionUID = -6124773037897786131L;
   private String type;
   private String category;
   private String gameId;
   private String gid;
   private String description;
   private String launchUrl;
   
   public Game() {}
   
   public String getType() {
      return type;
   }
   public void setType(String pType) {
      type = pType;
   }
   public String getCategory() {
      return category;
   }
   public void setCategory(String pCategory) {
      category = pCategory;
   }
   public String getGameId() {
      return gameId;
   }
   public void setGameId(String pGameId) {
      gameId = pGameId;
   }
   public String getGid() {
      return gid;
   }
   public void setGid(String pGid) {
      gid = pGid;
   }
   public String getDescription() {
      return description;
   }
   public void setDescription(String pDescription) {
      description = pDescription;
   }

   public String getLaunchUrl() {
      return launchUrl;
   }

   public void setLaunchUrl(String pLaunchUrl) {
      launchUrl = pLaunchUrl;
   }

   @Override
   public String toString() {
      return "Game [type=" + type + ", category=" + category + ", gameId=" + gameId + ", gid=" + gid + ", description="
            + description + "]";
   }
}