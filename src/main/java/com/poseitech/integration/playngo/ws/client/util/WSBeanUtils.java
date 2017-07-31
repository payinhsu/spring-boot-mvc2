package com.poseitech.integration.playngo.ws.client.util;

import com.poseitech.integration.playngo.model.PlaynGoUser;
import com.poseitech.integration.playngo.ws.client.model.GameUser;
import com.poseitech.integration.playngo.ws.client.model.user.RegisterUser;
import com.poseitech.utils.DateUtil;

public class WSBeanUtils {
   
   final public static RegisterUser parseToRegisterUser(PlaynGoUser pUser){
      /*
       * <v1:ExternalUserId>1234</v1:ExternalUserId> 
       * <v1:Username>TestUser</v1:Username> 
       * <v1:Nickname>TestUser123</v1:Nickname> 
       * <v1:Currency>EUR</v1:Currency> 
       * <v1:Country>SE</v1:Country> 
       * <v1:Birthdate>1977-07-07</v1:Birthdate> 
       * <v1:Registration>1978-08-08</v1:Registration> 
       * <v1:BrandId>TestBrand</v1:BrandId> 
       * <v1:Language>sv_SE</v1:Language> 
       * <v1:IP>1253456</v1:IP> 
       * <v1:Locked>false</v1:Locked> 
       * <v1:Gender>m</v1:Gender>
       * */
      GameUser gameUser = new GameUser();
      gameUser.setExternalUserId(pUser.getGameAccount());
      gameUser.setUsername(pUser.getUserName());
      gameUser.setNickname(pUser.getNickName());
      gameUser.setCurrency(pUser.getCurrencyCode());
      gameUser.setCountry(pUser.getCountryCode());
      gameUser.setBirthdate(DateUtil.format(pUser.getBirthday()));
      gameUser.setRegistration(DateUtil.format(pUser.getRegistrationDate())); //DateUtil.getNow(Commons.DATE_FORMAT_YMD)
      gameUser.setBrandId(pUser.getBrandId());
      gameUser.setLanguage(pUser.getLanguageCode());
//      if(pUser.getIpAddress() != null) {
//         gameUser.setIP(pUser.getIpAddress().getHostAddress());   
//      }
      gameUser.setIP(pUser.getIp());
      gameUser.setLocked(false);
      gameUser.setGender(pUser.getGender().getShortName());
      
      RegisterUser registerUser = new RegisterUser();
      registerUser.setUserInfo(gameUser);
      return registerUser;
   }

}
