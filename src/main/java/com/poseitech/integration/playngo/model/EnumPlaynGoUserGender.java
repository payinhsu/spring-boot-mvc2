package com.poseitech.integration.playngo.model;

public enum EnumPlaynGoUserGender {

   Male("m"), Female("f");

   private String shortName;

   private EnumPlaynGoUserGender(String pShortName) {
      this.shortName = pShortName;
   }

   public String getShortName() {
      return this.shortName;
   }
   
}
