package com.poseitech.integration.playngo.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poseitech.integration.playngo.config.MicroserviceApplication;
import com.poseitech.integration.playngo.model.EnumPlaynGoUserGender;
import com.poseitech.integration.playngo.model.PlaynGoBalance;
import com.poseitech.integration.playngo.model.PlaynGoUnfinishedGames;
import com.poseitech.integration.playngo.model.PlaynGoUser;
import com.poseitech.integration.util.JsonUtil;
import com.poseitech.utils.DateUtil;

/**
 * Sample junit test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MicroserviceApplication.class, initializers = ConfigFileApplicationContextInitializer.class)
public class PlaynGoServiceTest {

   private static final Logger log = LoggerFactory.getLogger(PlaynGoServiceTest.class);

   @Autowired
   private PlaynGoService playnGoService;

   @Test
   @Ignore
   public void testDebit() {
      try {
         PlaynGoUser playnGoUser = new PlaynGoUser();
         playnGoUser.setId(17809L);
         // playnGoUser.setPlayerAccount("PoseTest");
         playnGoUser.setGameAccount("PoseTest");
         playnGoUser.setGamePlatformId(13L);

         PlaynGoBalance playnGoBalance = new PlaynGoBalance();
         playnGoBalance.setSn("2016111312345678900000023"); // 23
         playnGoBalance.setTransferAmount(500);
         playnGoUser.setPlaynGoBalance(playnGoBalance);

         PlaynGoBalance vo = playnGoService.debit(playnGoUser, playnGoUser.getPlaynGoBalance());
         log.debug("--------> testDebit:" + JsonUtil.getJsonString(vo));

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testCredit() {
      try {
         PlaynGoUser playnGoUser = new PlaynGoUser();
         playnGoUser.setId(17809L);
         // playnGoUser.setPlayerAccount("PoseTest");
         playnGoUser.setGameAccount("PoseTest");
         playnGoUser.setGamePlatformId(13L);

         PlaynGoBalance playnGoBalance = new PlaynGoBalance();
         playnGoBalance.setSn("2016111312345678900000023"); // 23
         playnGoBalance.setTransferAmount(500);
         playnGoUser.setPlaynGoBalance(playnGoBalance);

         PlaynGoBalance vo = playnGoService.credit(playnGoUser, playnGoUser.getPlaynGoBalance());
         log.debug("--------> testCredit:" + JsonUtil.getJsonString(vo));

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testBalance() {
      try {
         PlaynGoUser playnGoUser = new PlaynGoUser();
         playnGoUser.setGameAccount("PoseTest");
         log.debug("--------> testBalance by playnGoUser:" + playnGoService.getBalance(playnGoUser));

         PlaynGoBalance vo = playnGoService.getBalance("PoseTest");
         log.debug("--------> testBalance:" + JsonUtil.getJsonString(vo));

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testRegisterUser() {
      try {
         PlaynGoUser pPlaynGoUser = new PlaynGoUser();
         String btd = "20160101";
         String regDate = "20160101";
         String genderCode = "m";
         pPlaynGoUser.setId(1L);
         pPlaynGoUser.setPlayerAccount("ceshi123");
         pPlaynGoUser.setGamePlatformId(-1L);
         pPlaynGoUser.setGameAccount("ceshi123Test");
         pPlaynGoUser.setBirthday(DateUtil.parseTwDate(btd));
         pPlaynGoUser.setRegistrationDate(DateUtil.parseTwDate(regDate));
         pPlaynGoUser.setRegistrationDate(DateUtil.parseTwDate(regDate));
         if (EnumPlaynGoUserGender.Male.getShortName().equals(genderCode)) {
            pPlaynGoUser.setGender(EnumPlaynGoUserGender.Male);
         } else {
            pPlaynGoUser.setGender(EnumPlaynGoUserGender.Female);
         }

         playnGoService.register(pPlaynGoUser);

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

   @Test
   @Ignore
   public void testGetTicket() {
      try {
         String ticket = playnGoService.getTicket("PoseTest");
         log.debug("--------> testGetTicket:" + ticket);

      } catch (Exception e) {
         log.error("error...", e);
      }
   }
   
   @Test
   @Ignore
   public void testGetUnfinishedGames() {
      try {
         PlaynGoUnfinishedGames games = new PlaynGoUnfinishedGames();
         games.setGames(playnGoService.getUnfinishedGames("168poseitech"));
         log.debug("--------> testGetUnfinishedGames:" + JsonUtil.getJsonString(games));

      } catch (Exception e) {
         log.error("error...", e);
      }
   }

}
