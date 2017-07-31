/** */
package com.poseitech.integration.playngo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@Import({ MicroserviceConfig.class })
/**
 * 
 * @author ${user}
 * 
 * ${tags}
 */
public class MicroserviceApplication {

   static final Logger log = LoggerFactory.getLogger(MicroserviceApplication.class);

   public static void main(String[] args) {
      SpringApplication.run(MicroserviceApplication.class, args);
   }

}
