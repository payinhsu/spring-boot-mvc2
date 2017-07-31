package com.poseitech.integration.playngo.dao;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.poseitech.integration.playngo.config.MicroserviceApplication;
import com.poseitech.legacy.t9betnew.dao.SkyUserDao;
import com.poseitech.legacy.t9betnew.entity.SkyGamePlatformDto;
import com.poseitech.legacy.t9betnew.entity.SkyUserDto;
import com.poseitech.legacy.t9betnew.entity.SkyUserGameDto;


@Commit
@Rollback(true)
@Transactional(transactionManager = "transactionManager")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MicroserviceApplication.class, initializers = ConfigFileApplicationContextInitializer.class)
public class SampleDaoTest {

   private static final Logger log = LoggerFactory.getLogger(SampleDaoTest.class);
   
   @Autowired
   private SkyUserDao skyUserDao;
   
   @Test
   public void testMethod() {
      try {

//         SkyUserDto skyUserDto = skyUserDao.get(17809L);

         SkyUserDto user = skyUserDao.get(17809L);
         int registeredGameCount = user.getUserRegisteredGamePlatfoms().size();
         Assert.isTrue(7==registeredGameCount, "user 17809 / nana9999 has 7 registered games, but test result is " + registeredGameCount);
         
         Set<SkyUserGameDto> registeredGamePlatforms = user.getUserRegisteredGamePlatfoms();
         SkyGamePlatformDto gameplatform = null;
         for(SkyUserGameDto usergame : registeredGamePlatforms) {
            gameplatform = usergame.getGamePlatform();
            log.info(gameplatform.toString());
//            Assert.isTrue(platformIds.contains(gameplatform.getId()), "Unexcept user registered game platform id " + gameplatform.getId()); 
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
