/**
 * PlaynGoUser.java created 2016年11月5日
 *
 */
package com.poseitech.integration.playngo.model;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author bj
 *
 */
public class PlaynGoUser implements Serializable {
   //
   private static final long serialVersionUID = -4841392240495609528L;
   
   @JsonProperty(required = true)
   private Long id;
   @JsonProperty(required = true)
   private String playerAccount;
   private String userName;
   // Nickname of the player. (2-12 letters. a-z A-Z 0-9 - . _ & space
   private String nickName;
   private String currencyCode;
   private String countryCode;
   @JsonIgnore
   private Date birthday;
   @JsonIgnore
   private Date registrationDate;
   private String btd;
   private String regDate;
   private String brandId;
   private String languageCode;
   // IP of player device.
   @JsonIgnore
   private InetAddress ipAddress;
   private String ip;
   @JsonIgnore
   private EnumPlaynGoUserGender gender;
   private String genderCode;
   @JsonProperty(required = true)
   private Long gamePlatformId;
   @JsonProperty(required = true)
   private String gameAccount;
   
   private PlaynGoBalance playnGoBalance;

   public Long getId() {
      return id;
   }

   public void setId(Long pId) {
      this.id = pId;
   }

   /**
    * Must be unique. Identification of the player.
    */
   public String getPlayerAccount() {
      return playerAccount;
   }

   public void setPlayerAccount(String pPlayerAccount) {
      playerAccount = pPlayerAccount;
   }

   /**
    * Login of the player.
    */
   public String getUserName() {
      return userName;
   }

   public void setUserName(String pUserName) {
      userName = pUserName;
   }

   /**
    * Nickname of the player. (2-12 letters. a-z A-Z 0-9 - . _ & space)
    */
   public String getNickName() {
      return nickName;
   }

   public void setNickName(String pNickName) {
      nickName = pNickName;
   }

   public String getCurrencyCode() {
      return currencyCode;
   }

   public void setCurrencyCode(String pCurrencyCode) {
      currencyCode = pCurrencyCode;
   }

   public String getCountryCode() {
      return countryCode;
   }

   public void setCountryCode(String pCountryCode) {
      countryCode = pCountryCode;
   }

   /**
    * date format example: 1977-07-07
    */
   public Date getBirthday() {
      return birthday;
   }

   public void setBirthday(Date pBirthday) {
      birthday = pBirthday;
   }

   /**
    * date format example: 1977-07-07
    */
   public Date getRegistrationDate() {
      return registrationDate;
   }

   public void setRegistrationDate(Date pRegistrationDate) {
      registrationDate = pRegistrationDate;
   }

   /**
    * Operator additional brand id e.g affiliates or for multi-brand operators.
    */
   public String getBrandId() {
      return brandId;
   }

   public void setBrandId(String pBrandId) {
      brandId = pBrandId;
   }

   public String getLanguageCode() {
      return languageCode;
   }

   public void setLanguageCode(String pLanguageCode) {
      languageCode = pLanguageCode;
   }

   /**
    * IP of player device.
    */
   public InetAddress getIpAddress() {
      return ipAddress;
   }

   public void setIpAddress(InetAddress pIpAddress) {
      ipAddress = pIpAddress;
   }

   public String getIp() {
      return ip;
   }

   public void setIp(String pIp) {
      this.ip = pIp;
   }

   public EnumPlaynGoUserGender getGender() {
      return gender;
   }

   public void setGender(EnumPlaynGoUserGender pGender) {
      gender = pGender;
   }

   public String getGenderCode() {
      return genderCode;
   }

   public void setGenderCode(String pGenderCode) {
      this.genderCode = pGenderCode;
   }

   public Long getGamePlatformId() {
      return gamePlatformId;
   }

   public void setGamePlatformId(Long pGamePlatformId) {
      this.gamePlatformId = pGamePlatformId;
   }

   public String getGameAccount() {
      return gameAccount;
   }

   public void setGameAccount(String pGameAccount) {
      this.gameAccount = pGameAccount;
   }

   public String getBtd() {
      return btd;
   }

   public void setBtd(String pBtd) {
      this.btd = pBtd;
   }

   public String getRegDate() {
      return regDate;
   }

   public void setRegDate(String pRegDate) {
      this.regDate = pRegDate;
   }

   public PlaynGoBalance getPlaynGoBalance() {
      return playnGoBalance;
   }

   public void setPlaynGoBalance(PlaynGoBalance playnGoBalance) {
      this.playnGoBalance = playnGoBalance;
   }

   @Override
   public String toString() {
      StringBuilder builder = new StringBuilder();
      builder.append("PlaynGoUser [id=");
      builder.append(id);
      builder.append(", playerAccount=");
      builder.append(playerAccount);
      builder.append(", userName=");
      builder.append(userName);
      builder.append(", nickName=");
      builder.append(nickName);
      builder.append(", currencyCode=");
      builder.append(currencyCode);
      builder.append(", countryCode=");
      builder.append(countryCode);
      builder.append(", languageCode=");
      builder.append(languageCode);
      builder.append(", gamePlatformId=");
      builder.append(gamePlatformId);
      builder.append(", gameAccount=");
      builder.append(gameAccount);
      builder.append(", playnGoBalance=");
      builder.append(playnGoBalance);
      builder.append("]");
      return builder.toString();
   }
}
